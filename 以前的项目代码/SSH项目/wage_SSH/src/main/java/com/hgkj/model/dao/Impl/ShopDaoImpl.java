package com.hgkj.model.dao.Impl;

import com.hgkj.model.dao.ShopDao;
import com.hgkj.model.entity.Shop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
@Transactional
public class ShopDaoImpl implements ShopDao {
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    public Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    @Override
    public List<Shop> allShopDao(Shop shop) {
        Query query=getSession().createQuery("from Shop ");
        return query.list();
    }

    @Override
    public boolean addShopDao(Shop shop) {
        getSession().save(shop);
        return false;
    }

    @Override
    public boolean delShopDao(int shopId) {
        Shop shop=new Shop();
        shop.setShopId(shopId);
        getSession().delete(shop);
        return false;
    }

    @Override
    public boolean updateShopDao(Shop shop) {
        getSession().update(shop);
        return false;
    }

    @Override
    public Shop ShopByIdDao(int shopId) {
        Shop shop=getSession().get(Shop.class,shopId);
        return shop;
    }
}
