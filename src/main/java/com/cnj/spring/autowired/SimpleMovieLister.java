package com.cnj.spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

/**
 * @project:spring-learn
 * @package:com.cnj.spring
 * @author:Subtimental
 * @create_date:2017/11/29 19:40
 * @todo:
 */
public class SimpleMovieLister {
    private Optional<MovieFinder> movieFinder;

    @Autowired
    public void setMovieFinder(Optional<MovieFinder> movieFinder) {
        this.movieFinder = movieFinder;
    }
}
