package com.springboot.service;

import java.util.List;

import com.springboot.dao.UserInfoDO;

/**
 * 用戶login
 * */
public interface GetUserLoginService {

	List<UserInfoDO> getUserLoginService(String username, String password);
	
	List<UserInfoDO> getUserRoleByUserId(int userId);
	
	List<UserInfoDO> getAllUser();
	
	boolean editUserInfo(UserInfoDO userInfoDO);
	
	boolean createUserInfo(UserInfoDO userInfoDO);
	
	boolean delUserInfo(int userId);
}
