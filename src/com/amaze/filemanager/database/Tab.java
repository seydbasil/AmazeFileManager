/*
 * Copyright (C) 2014 Vishal Nehra <vishalmeham2@gmail.com>
 *
 * This file is part of Amaze File Manager.
 *
 * Amaze File Manager is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.amaze.filemanager.database;

/**
 * Created by Vishal on 9/17/2014.
 */
public class Tab {

    private int _id;
    private int _tab_no;
    private String _label;
    private String _path;

    public Tab() {
        // Empty constructor
    }

    public Tab(int id, int tab_no, String label, String path) {
        this._id = id;
        this._tab_no = tab_no;
        this._label = label;
        this._path = path;

    }

    public Tab(int tab_no, String label, String path) {
        this._tab_no = tab_no;
        this._label = label;
        this._path = path;
    }

    public Tab(int id, int tab_no, String label) {
        this._id = id;
        this._tab_no = tab_no;
        this._label = label;
    }

    public Tab(int id, int tab_no) {
        this._id = id;
        this._tab_no = tab_no;
    }

    public Tab(int id) {
        this._id = id;
    }

    public void setID(int id) {
        this._id = id;
    }

    public int getID() {
        return this._id;
    }

    public void setTab(int tab_no) {
        this._tab_no = tab_no;
    }

    public int getTab() {
        return this._tab_no;
    }

    public void setLabel(String label) {
        this._label = label;
    }

    public String getLabel() {
        return this._label;
    }

    public void setPath(String path) {
        this._path = path;
    }

    public String getPath() {
        return this._path;
    }
}
