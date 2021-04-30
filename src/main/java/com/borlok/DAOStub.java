package com.borlok;

import java.util.ArrayList;

public class DAOStub {

    public ArrayList<DataBean> getDataBeanList() {
        ArrayList<DataBean> dataBeanList = new ArrayList<>();
        DataBean tempBean = new DataBean();
        tempBean.setName("Petr");
        tempBean.setDiscipline("Phisics");
        tempBean.setAbsence(2);
        dataBeanList.add(tempBean);

        tempBean = new DataBean();
        tempBean.setName("Vasa");
        tempBean.setDiscipline("History");
        tempBean.setAbsence(3);
        dataBeanList.add(tempBean);

        tempBean = new DataBean();
        tempBean.setName("Ira");
        tempBean.setDiscipline("English");
        tempBean.setAbsence(5);
        dataBeanList.add(tempBean);

        return dataBeanList;
    }
}
