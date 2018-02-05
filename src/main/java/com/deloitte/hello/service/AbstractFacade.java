/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deloitte.hello.service;

import javax.ws.rs.core.Response;

/**
 *
 * @author pestupinan
 */
public abstract class AbstractFacade {

    /**
     *
     * @param name
     * @return
     */
    public abstract Response greet(String name);

}
