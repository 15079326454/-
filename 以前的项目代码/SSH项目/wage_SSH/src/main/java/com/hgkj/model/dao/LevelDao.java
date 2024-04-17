package com.hgkj.model.dao;
import com.hgkj.model.entity.Level;

import java.util.List;

public interface LevelDao {
        public List<Level> allLevelDao(Level level);
        public  boolean addLevDao(Level level);
        public  boolean delLevDao(int levelId);
        public  boolean updLevDao(Level level);
        public  Level LevByIdDao(int levelId);
}
