package com.fc.test.mapper.custom;

import java.util.List;

import com.fc.test.model.auto.TsysPremission;

public interface  PermissionDao {
	 public List<TsysPremission> findAll();
	 public List<TsysPremission> findByAdminUserId(String userId);
}
