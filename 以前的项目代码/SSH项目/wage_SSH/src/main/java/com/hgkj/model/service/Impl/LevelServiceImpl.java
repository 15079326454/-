package com.hgkj.model.service.Impl;

import com.hgkj.model.dao.LevelDao;
import com.hgkj.model.entity.Level;
import com.hgkj.model.service.LevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LevelServiceImpl implements LevelService {
    @Autowired
    private LevelDao levelDao;

    public void setLevelDao(LevelDao levelDao) {
        this.levelDao = levelDao;
    }


    @Override
    public List<Level> allLevelService(Level level) {
        return levelDao.allLevelDao(level);
    }

    @Override
    public boolean addLevService(Level level) {
        return levelDao.addLevDao(level);
    }

    @Override
    public boolean delLevService(int levelId) {
        return levelDao.delLevDao(levelId);
    }

    @Override
    public boolean updLevService(Level level) {
        return levelDao.updLevDao(level);
    }

    @Override
    public Level LevByIdService(int levelId) {
        return levelDao.LevByIdDao(levelId);
    }
}
