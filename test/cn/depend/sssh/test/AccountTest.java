package cn.depend.sssh.test;

import java.util.HashSet;
import java.util.Set;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.depend.sssh.background.sevices.AccountManageService;
import com.depend.sssh.background.sevices.AuthorityManageService;
import com.depend.sssh.background.sevices.ResourcesManageService;
import com.depend.sssh.common.utils.UUIDUtils;
import com.depend.sssh.entity.AccountInfo;
import com.depend.sssh.entity.AuthorityInfo;
import com.depend.sssh.entity.ResourcesInfo;

/**
 * 
 * @author Administrator
 *
 */
@SuppressWarnings("all")
public class AccountTest {

	@Autowired
	private static AccountManageService accountManageService;
	@Autowired
	private static AuthorityManageService authorityManageService;
	@Autowired
	private static ResourcesManageService resourcesManageService;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		accountManageService = (AccountManageService) ac.getBean("accountManageServiceImpl");
		authorityManageService = (AuthorityManageService) ac.getBean("authorityManageServiceImpl");
		resourcesManageService = (ResourcesManageService) ac.getBean("resourcesManageServiceImpl");
	}

	/**
	 * 根据email 查询账户信息
	 */
	@Test
	public void getAccountByEmail(){
		AccountInfo accountInfo = accountManageService.getByEmail("blacksalon@163.com");
		System.out.println(accountInfo);
	}
	
	/**
	 * 设置权限资源
	 */
	@Test
	public void setAuthorityResources(){
		AuthorityInfo authorityInfo = authorityManageService.getByid("11d59d7224ac4659b6e0763d92476d22");
		System.out.println("当前权限及其资源："+ authorityInfo.getCode());
		Set<ResourcesInfo> set1 = authorityInfo.getResourcesInfos();
		for (ResourcesInfo resourcesInfo : set1) {
			System.out.println(resourcesInfo.getName()+" : " +resourcesInfo.getUrl());
		}
//		List<ResourcesInfo> list =  resourcesManageService.getAll().getResultList();
//		Set<ResourcesInfo> set = new HashSet<>();
//		set.addAll(list);
//		authoritiesInfo.setResourcesInfos(set);
//		// 测试暂时使用 update 方法
//		authoritiesManageService.update(authoritiesInfo);
//		System.out.println("设置权限资源成功！");
	}
	
	/**
	 * 设置账户权限
	 */
	@Test
	public void setAccountAuthorities() {
		AccountInfo acc = accountManageService.getByid("9e540127fb834c9db68125d6446a5d49");
		System.out.println(acc);
		Set<AuthorityInfo> yyset = acc.getAuthorityInfos();
		for (AuthorityInfo authoritiesInfo : yyset) {
			System.out.println("当前用户已经拥有的权限："+authoritiesInfo.getCode()+" "+authoritiesInfo.getName());
		}
		Set<AuthorityInfo> set = new HashSet<AuthorityInfo>(authorityManageService.getAll().getResultList());// (Set<AuthoritiesInfo>) authoritiesManageService.getAll().getResultList();
		for (AuthorityInfo authoritiesInfo : set) {
			System.out.println(authoritiesInfo.getCode());
		}
		acc.setAuthorityInfos(set);
		accountManageService.update(acc);
		System.out.println("权限设置成功");
	}

	/**
	 * 添加子级资源
	 */
	@Test
	public void saveChildResources() {
		ResourcesInfo parentResources = resourcesManageService.getByid("f223415be61643e28f199708b55b1ebd");
		ResourcesInfo childresourcesInfo = new ResourcesInfo();
		childresourcesInfo.setId(UUIDUtils.getUUID());
		childresourcesInfo.setParentResource(parentResources);
		childresourcesInfo.setName("转到用户添加");
		childresourcesInfo.setUrl("/toAdd");
		childresourcesInfo.setCreator("blacksalon@163.com");
		childresourcesInfo.setRemark("转到添加用户页面");
		childresourcesInfo.setModifyPeople("blacksalon@163.com");
		try {

			resourcesManageService.save(childresourcesInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ok....");
	}

	/**
	 * 添加父级资源
	 */
	@Test
	public void saveParentResources() {

		ResourcesInfo resourcesInfo = new ResourcesInfo();
		resourcesInfo.setId(UUIDUtils.getUUID());
		resourcesInfo.setName("权限信息管理");
		resourcesInfo.setUrl("");
		resourcesInfo.setCreator("blacksalon@163.com");
		resourcesInfo.setRemark("权限信息管理，角色管理");
		resourcesInfo.setModifyPeople("blacksalon@163.com");
		try {

			resourcesManageService.save(resourcesInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 添加权限
	 */
	@Test
	public void saveAuthorities() {
		AuthorityInfo authoritiesInfo = new AuthorityInfo();
		authoritiesInfo.setId(UUIDUtils.getUUID());
		authoritiesInfo.setCode("ROLE_TEST");
		authoritiesInfo.setName("TEST");
		authoritiesInfo.setCreator("blacksalon@163.com");
		authoritiesInfo.setRemark("TEST");
		authoritiesInfo.setModifyPeople("blacksalon@163.com");
		try {

			authorityManageService.save(authoritiesInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 添加账户
	 */
	@Test
	public void saveAccount() {
		try {

			AccountInfo accountInfo = new AccountInfo();
			accountInfo.setId(UUIDUtils.getUUID());
			accountInfo.setEmail("test");
			accountInfo.setPassword("test");
			accountInfo.setEnabled(true);
			accountInfo.setNikename("test");
			accountInfo.setAccountNonExpired(true);
			accountInfo.setAccountNonLocked(true);
			accountInfo.setCredentialsNonExpired(true);
			accountInfo.setCreatedIPAddress("127.0.0.1");
			accountInfo.setCellphone("15213771587");
			accountManageService.save(accountInfo);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
