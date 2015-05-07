/*
 * Copyright 2015 Red Hat, Inc.
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published
 * by the Free Software Foundation; either version 2, or (at your
 * option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; see the file COPYING.  If not see
 * <http://www.gnu.org/licenses/>.
 */

package com.redhat.byteman.thermostat.client;

import org.jboss.byteman.agent.submit.Submit;

import java.io.InputStream;

import static java.util.Collections.singletonList;

/**
 * Byteman socket client example
 */
public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("started");
        Submit submit = new Submit("127.0.0.1", 9091);
        System.out.println(submit.deleteAllRules());
        System.out.println("rules deleted");
        try (InputStream is = Client.class.getResourceAsStream("/btm/02.btm")) {
            submit.addRulesFromResources(singletonList(is));
            System.out.println("rule installed");
        }
        System.out.println("exited");
    }
}
