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

package com.redhat.byteman.thermostat.app;

/**
 * Business application example
 */
public class Application {
    public static void main(String[] args) throws InterruptedException {
        for (;;) {
            running();
            Thread.sleep(2000);
        }
    }

    private static void running() {
        System.out.println("running");
    }
}
