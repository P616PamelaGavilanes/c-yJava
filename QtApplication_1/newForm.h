/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   newForm.h
 * Author: User
 *
 * Created on 24 de julio de 2020, 16:20
 */

#ifndef _NEWFORM_H
#define _NEWFORM_H

#include "ui_newForm.h"
widget::Widget(QWidget *parent):
QWidget(parent);

class newForm : public QDialog {
    Q_OBJECT
public:
    newForm();
    virtual ~newForm();
private:
    Ui::newForm widget;
};

#endif /* _NEWFORM_H */
