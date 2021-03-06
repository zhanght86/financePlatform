package com.sunlights.customer.dal.impl;

import com.sunlights.common.dal.EntityBaseDao;
import com.sunlights.customer.dal.ExchangeResultDao;
import models.ExchangeResult;

import java.util.Date;

/**
 * Created by tangweiqun on 2014/12/4.
 */
public class ExchangeResultDaoImpl extends EntityBaseDao implements ExchangeResultDao {

    @Override
    public void doInsert(ExchangeResult exchangeResult) {
        exchangeResult.setCreateTime(new Date());
        super.create(exchangeResult);
    }
}
