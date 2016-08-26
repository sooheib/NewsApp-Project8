/*
 * Copyright (c) 2016. Self Training Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by TienNguyen <tien.workinfo@gmail.com - tien.workinfo@icloud.com>, October 2015
 */

package com.example.sooheib.newsapp_project8.asyncTask;


import com.example.sooheib.newsapp_project8.models.NewsModel;

import java.util.List;

/**
 * Created by sooheib on 8/27/16.
 */
public interface NewsOnTaskCompleted {
    /**
     * onTaskCompleted
     *
     * @param newsModelList List<NewsModel>
     */
    void onTaskCompleted(List<NewsModel> newsModelList);
}
