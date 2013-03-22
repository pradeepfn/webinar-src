package org.webinar.sample;/*
*  Copyright (c) 2005-2012, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/

import java.util.Date;

public class AccessUtil {
    private static ThreadLocal<AccessTime> threadLocal = new ThreadLocal<AccessTime>();

    public static Date getLastAccessTime(){
        final AccessTime accessTime = threadLocal.get();

        threadLocal.set(new AccessTime());

        return accessTime != null? accessTime.value : new Date();
    }
}

final class AccessTime {
    public Date value = new Date();

    public AccessTime() {
        new Class1();
    }
}

final class Class1{
    public Class1() {
        new Class2();
    }
}

final class Class2{
    public Class2() {
        new Class3();
    }
}

final class Class3{

}
