package com.peppayi.designpattern.headfirst.chapters.chapter04;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Pizza {

    public void prepare() {
        log.info("准备");
    }

    public void bake() {
        log.info("烘培");
    }

    public void cut() {
        log.info("切分");
    }

    public void box() {
        log.info("打包");
    }
}
