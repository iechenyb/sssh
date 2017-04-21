package com.depend.sssh.common.beans;

/**
 * 性别
 * 
 * @author root
 *
 */
public enum GenderEnum {

	MAN {
		@Override
		public String getName() {
			return "男";
		}
	},

	WOMEN {
		@Override
		public String getName() {
			return "女";
		}
	};

	public abstract String getName();
}
