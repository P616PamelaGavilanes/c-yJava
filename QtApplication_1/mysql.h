/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   mysql.h
 * Author: User
 *
 * Created on 24 de julio de 2020, 18:58
 */
QMAKE_CXXFLAGS += -std=gnu++11
#ifndef _MYSQL_H
#define _MYSQL_H
#include <QSqlDatabase>
#include "ui_mysql.h"

namespace Ui {
    class Widget;
}
class QSqlTableModel ;
class Widget : public QWidget{
        Q_OBJECT 
        public : 
    expicit Widget {QWidget *parent =0};
    Widgect();
    private :
        Ui::Widget *ui;
        QSqlTableModel*mModel;
        QSqlDatabase mDatabase;

    }
#endif /* _MYSQL_H */
