package com.hgkj.model.dao.Impl;

import com.hgkj.model.dao.LevelDao;
import com.hgkj.model.entity.Level;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class LevelDaoImpl implements LevelDao {
    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public List<Level> allLevelDao(Level level) {
        Query query=getSession().createQuery("from Level ");
        return query.list();
    }

    @Override
    public boolean addLevDao(Level level) {
        getSession().save(level);
        return false;
    }

    @Override
    public boolean delLevDao(int levelId) {
        Level level=new Level();
        level.setLevelId(levelId);
        getSession().delete(level);
        return false;
    }

    @Override
    public boolean updLevDao(Level level) {
        getSession().update(level);
        return false;
    }

    @Override
    public Level LevByIdDao(int levelId) {
        Level level=getSession().get(Level.class,levelId);
        return level;
    }
}
