package com.hgkj.model.service;

import com.hgkj.model.entity.Level;

import java.util.List;

public interface LevelService {
        public List<Level> allLevelService(Level level);
        public  boolean addLevService(Level level);
        public  boolean delLevService(int levelId);
        public  boolean updLevService(Level level);
        public  Level LevByIdService(int levelId);
}
