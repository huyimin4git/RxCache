/*
 * Copyright 2015 Victor Albertos
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.rx_cache.internal;

interface Locale {
    String INVALID_RETURN_TYPE = " needs to return an Observable<T> or Observable<Reply<T>>" ;
    String NOT_DATA_RETURN_WHEN_CALLING_OBSERVABLE_LOADER = "The Loader provided did not return any data and there is not data to load from the Cache";
    String REPOSITORY_DISK_ADAPTER_CAN_NOT_BE_NULL = "File cache directory can not be null";
    String PERSISTENCE_CAN_NOT_BE_NULL = "Persistence can not be null";
    String NOT_OBSERVABLE_LOADER_FOUND = " requires an instance of type observable";
    String JUST_ONE_INSTANCE = " requires just one instance of type ";
    String EVICT_DYNAMIC_KEY_PROVIDED_BUT_NOT_PROVIDED_ANY_DYNAMIC_KEY = " EvictDynamicKey was provided but not was provided any DynamicKey";
    String EVICT_DYNAMIC_KEY_GROUP_PROVIDED_BUT_NOT_PROVIDED_ANY_DYNAMIC_KEY_GROUP = " EvictDynamicKeyGroup was provided but not was provided any Group";

}
