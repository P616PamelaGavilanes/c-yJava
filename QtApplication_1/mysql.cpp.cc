/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * File:   mysql.cpp
 * Author: User
 *
 * Created on 24 de julio de 2020, 18:58
 */

#include "mysql.h"
#include  <QSqlTableModel>

mysql::mysql() {
    widget.setupUi(this);
}

widget::Widgect( QWidgect *parent):
        QWidget(parent),
        ui(newUi::Widget)
{
    ui->setupUi(this);
    mDatabase =QSqlDatabase ::addDatabase (QMYSQL);
    mDatabase.setHostName(“localhost”);
    mDatabase.setDatabaseName(“estudiante”);
    mDatabase.setPort(3306);
    mDatabase.setUserName(“root”);
    mDatabase.setPassword(“mama0992”);
    if(!mDatabase.open()){
    QMessageBox::critical(this,”error”,mDatabase.lastError().text());
    return;
    }
    mModel =new QSqlTableModel(this);
    mModel->setTable(“estudiante”);
    mModel->select();
    ui->tableView->setModel(mModel);


}

void Widget::on_nuevo_clicked()
{
    mModel->insertRow(mModel->rowCount());
}