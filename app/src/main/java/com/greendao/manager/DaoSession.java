package com.greendao.manager;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.parachute.administrator.DATAbase.greendao.MotorEnity;
import com.parachute.administrator.DATAbase.greendao.TaskEntity;
import com.parachute.administrator.DATAbase.greendao.TaskResEnity;

import com.greendao.manager.MotorEnityDao;
import com.greendao.manager.TaskEntityDao;
import com.greendao.manager.TaskResEnityDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig motorEnityDaoConfig;
    private final DaoConfig taskEntityDaoConfig;
    private final DaoConfig taskResEnityDaoConfig;

    private final MotorEnityDao motorEnityDao;
    private final TaskEntityDao taskEntityDao;
    private final TaskResEnityDao taskResEnityDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        motorEnityDaoConfig = daoConfigMap.get(MotorEnityDao.class).clone();
        motorEnityDaoConfig.initIdentityScope(type);

        taskEntityDaoConfig = daoConfigMap.get(TaskEntityDao.class).clone();
        taskEntityDaoConfig.initIdentityScope(type);

        taskResEnityDaoConfig = daoConfigMap.get(TaskResEnityDao.class).clone();
        taskResEnityDaoConfig.initIdentityScope(type);

        motorEnityDao = new MotorEnityDao(motorEnityDaoConfig, this);
        taskEntityDao = new TaskEntityDao(taskEntityDaoConfig, this);
        taskResEnityDao = new TaskResEnityDao(taskResEnityDaoConfig, this);

        registerDao(MotorEnity.class, motorEnityDao);
        registerDao(TaskEntity.class, taskEntityDao);
        registerDao(TaskResEnity.class, taskResEnityDao);
    }
    
    public void clear() {
        motorEnityDaoConfig.clearIdentityScope();
        taskEntityDaoConfig.clearIdentityScope();
        taskResEnityDaoConfig.clearIdentityScope();
    }

    public MotorEnityDao getMotorEnityDao() {
        return motorEnityDao;
    }

    public TaskEntityDao getTaskEntityDao() {
        return taskEntityDao;
    }

    public TaskResEnityDao getTaskResEnityDao() {
        return taskResEnityDao;
    }

}
