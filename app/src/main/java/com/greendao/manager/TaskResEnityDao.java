package com.greendao.manager;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.parachute.administrator.DATAbase.greendao.TaskResEnity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "TASK_RES_ENITY".
*/
public class TaskResEnityDao extends AbstractDao<TaskResEnity, Long> {

    public static final String TABLENAME = "TASK_RES_ENITY";

    /**
     * Properties of entity TaskResEnity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property TaskId = new Property(1, Long.class, "taskId", false, "TASK_ID");
        public final static Property Csff = new Property(2, String.class, "csff", false, "CSFF");
        public final static Property Tffs = new Property(3, String.class, "tffs", false, "TFFS");
        public final static Property SaveIndex = new Property(4, int.class, "saveIndex", false, "SAVE_INDEX");
        public final static Property SaveTime = new Property(5, String.class, "SaveTime", false, "SAVE_TIME");
        public final static Property SaveType = new Property(6, int.class, "saveType", false, "SAVE_TYPE");
        public final static Property Xk1 = new Property(7, float.class, "xk1", false, "XK1");
        public final static Property Xk2 = new Property(8, float.class, "xk2", false, "XK2");
        public final static Property Xdzds1 = new Property(9, float.class, "xdzds1", false, "XDZDS1");
        public final static Property Xdzds2 = new Property(10, float.class, "xdzds2", false, "XDZDS2");
        public final static Property Xdhcs1 = new Property(11, float.class, "xdhcs1", false, "XDHCS1");
        public final static Property Xdhcs2 = new Property(12, float.class, "xdhcs2", false, "XDHCS2");
        public final static Property Xjgd = new Property(13, float.class, "xjgd", false, "XJGD");
        public final static Property Curve = new Property(14, String.class, "curve", false, "CURVE");
        public final static Property Zdjsd = new Property(15, float.class, "zdjsd", false, "ZDJSD");
        public final static Property Pjjsd = new Property(16, float.class, "pjjsd", false, "PJJSD");
        public final static Property Kxcsj = new Property(17, float.class, "kxcsj", false, "KXCSJ");
        public final static Property Kxcjl = new Property(18, float.class, "kxcjl", false, "KXCJL");
        public final static Property Zdsj = new Property(19, float.class, "zdsj", false, "ZDSJ");
    }


    public TaskResEnityDao(DaoConfig config) {
        super(config);
    }
    
    public TaskResEnityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"TASK_RES_ENITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"TASK_ID\" INTEGER," + // 1: taskId
                "\"CSFF\" TEXT," + // 2: csff
                "\"TFFS\" TEXT," + // 3: tffs
                "\"SAVE_INDEX\" INTEGER NOT NULL ," + // 4: saveIndex
                "\"SAVE_TIME\" TEXT," + // 5: SaveTime
                "\"SAVE_TYPE\" INTEGER NOT NULL ," + // 6: saveType
                "\"XK1\" REAL NOT NULL ," + // 7: xk1
                "\"XK2\" REAL NOT NULL ," + // 8: xk2
                "\"XDZDS1\" REAL NOT NULL ," + // 9: xdzds1
                "\"XDZDS2\" REAL NOT NULL ," + // 10: xdzds2
                "\"XDHCS1\" REAL NOT NULL ," + // 11: xdhcs1
                "\"XDHCS2\" REAL NOT NULL ," + // 12: xdhcs2
                "\"XJGD\" REAL NOT NULL ," + // 13: xjgd
                "\"CURVE\" TEXT," + // 14: curve
                "\"ZDJSD\" REAL NOT NULL ," + // 15: zdjsd
                "\"PJJSD\" REAL NOT NULL ," + // 16: pjjsd
                "\"KXCSJ\" REAL NOT NULL ," + // 17: kxcsj
                "\"KXCJL\" REAL NOT NULL ," + // 18: kxcjl
                "\"ZDSJ\" REAL NOT NULL );"); // 19: zdsj
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"TASK_RES_ENITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, TaskResEnity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long taskId = entity.getTaskId();
        if (taskId != null) {
            stmt.bindLong(2, taskId);
        }
 
        String csff = entity.getCsff();
        if (csff != null) {
            stmt.bindString(3, csff);
        }
 
        String tffs = entity.getTffs();
        if (tffs != null) {
            stmt.bindString(4, tffs);
        }
        stmt.bindLong(5, entity.getSaveIndex());
 
        String SaveTime = entity.getSaveTime();
        if (SaveTime != null) {
            stmt.bindString(6, SaveTime);
        }
        stmt.bindLong(7, entity.getSaveType());
        stmt.bindDouble(8, entity.getXk1());
        stmt.bindDouble(9, entity.getXk2());
        stmt.bindDouble(10, entity.getXdzds1());
        stmt.bindDouble(11, entity.getXdzds2());
        stmt.bindDouble(12, entity.getXdhcs1());
        stmt.bindDouble(13, entity.getXdhcs2());
        stmt.bindDouble(14, entity.getXjgd());
 
        String curve = entity.getCurve();
        if (curve != null) {
            stmt.bindString(15, curve);
        }
        stmt.bindDouble(16, entity.getZdjsd());
        stmt.bindDouble(17, entity.getPjjsd());
        stmt.bindDouble(18, entity.getKxcsj());
        stmt.bindDouble(19, entity.getKxcjl());
        stmt.bindDouble(20, entity.getZdsj());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, TaskResEnity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        Long taskId = entity.getTaskId();
        if (taskId != null) {
            stmt.bindLong(2, taskId);
        }
 
        String csff = entity.getCsff();
        if (csff != null) {
            stmt.bindString(3, csff);
        }
 
        String tffs = entity.getTffs();
        if (tffs != null) {
            stmt.bindString(4, tffs);
        }
        stmt.bindLong(5, entity.getSaveIndex());
 
        String SaveTime = entity.getSaveTime();
        if (SaveTime != null) {
            stmt.bindString(6, SaveTime);
        }
        stmt.bindLong(7, entity.getSaveType());
        stmt.bindDouble(8, entity.getXk1());
        stmt.bindDouble(9, entity.getXk2());
        stmt.bindDouble(10, entity.getXdzds1());
        stmt.bindDouble(11, entity.getXdzds2());
        stmt.bindDouble(12, entity.getXdhcs1());
        stmt.bindDouble(13, entity.getXdhcs2());
        stmt.bindDouble(14, entity.getXjgd());
 
        String curve = entity.getCurve();
        if (curve != null) {
            stmt.bindString(15, curve);
        }
        stmt.bindDouble(16, entity.getZdjsd());
        stmt.bindDouble(17, entity.getPjjsd());
        stmt.bindDouble(18, entity.getKxcsj());
        stmt.bindDouble(19, entity.getKxcjl());
        stmt.bindDouble(20, entity.getZdsj());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public TaskResEnity readEntity(Cursor cursor, int offset) {
        TaskResEnity entity = new TaskResEnity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1), // taskId
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // csff
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // tffs
            cursor.getInt(offset + 4), // saveIndex
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // SaveTime
            cursor.getInt(offset + 6), // saveType
            cursor.getFloat(offset + 7), // xk1
            cursor.getFloat(offset + 8), // xk2
            cursor.getFloat(offset + 9), // xdzds1
            cursor.getFloat(offset + 10), // xdzds2
            cursor.getFloat(offset + 11), // xdhcs1
            cursor.getFloat(offset + 12), // xdhcs2
            cursor.getFloat(offset + 13), // xjgd
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // curve
            cursor.getFloat(offset + 15), // zdjsd
            cursor.getFloat(offset + 16), // pjjsd
            cursor.getFloat(offset + 17), // kxcsj
            cursor.getFloat(offset + 18), // kxcjl
            cursor.getFloat(offset + 19) // zdsj
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, TaskResEnity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setTaskId(cursor.isNull(offset + 1) ? null : cursor.getLong(offset + 1));
        entity.setCsff(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTffs(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setSaveIndex(cursor.getInt(offset + 4));
        entity.setSaveTime(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setSaveType(cursor.getInt(offset + 6));
        entity.setXk1(cursor.getFloat(offset + 7));
        entity.setXk2(cursor.getFloat(offset + 8));
        entity.setXdzds1(cursor.getFloat(offset + 9));
        entity.setXdzds2(cursor.getFloat(offset + 10));
        entity.setXdhcs1(cursor.getFloat(offset + 11));
        entity.setXdhcs2(cursor.getFloat(offset + 12));
        entity.setXjgd(cursor.getFloat(offset + 13));
        entity.setCurve(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setZdjsd(cursor.getFloat(offset + 15));
        entity.setPjjsd(cursor.getFloat(offset + 16));
        entity.setKxcsj(cursor.getFloat(offset + 17));
        entity.setKxcjl(cursor.getFloat(offset + 18));
        entity.setZdsj(cursor.getFloat(offset + 19));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(TaskResEnity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(TaskResEnity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(TaskResEnity entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
