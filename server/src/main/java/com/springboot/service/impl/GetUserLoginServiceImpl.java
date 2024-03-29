package com.springboot.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.UserInfoDO;
import com.springboot.mapper.GetUserLoginMapper;
import com.springboot.service.GetUserLoginService;

/**
 * 用戶登錄
 * */
@Service
public class GetUserLoginServiceImpl implements GetUserLoginService{
	
	@Autowired
	GetUserLoginMapper getUserLoginMapper;

	@Override
	public List<UserInfoDO> getUserLoginService(String username, String password) {
		return getUserLoginMapper.getUserLoginService(username, password);
	}

	@Override
	public List<UserInfoDO> getUserRoleByUserId(int userId) {
		return getUserLoginMapper.getUserRoleIdByUserId(userId);
	}

	@Override
	public List<UserInfoDO> getAllUser() {
		return getUserLoginMapper.getAllUser();
	}

	@Override
	public boolean editUserInfo(UserInfoDO userInfoDO) {
		return getUserLoginMapper.editUserInfo(userInfoDO);
	}

	@Override
	public boolean createUserInfo(UserInfoDO userInfoDO) {
		return getUserLoginMapper.createUserInfo(userInfoDO);
	}

	@Override
	public boolean delUserInfo(int userId) {
		return getUserLoginMapper.delUserInfo(userId);
	}

	
	
}
