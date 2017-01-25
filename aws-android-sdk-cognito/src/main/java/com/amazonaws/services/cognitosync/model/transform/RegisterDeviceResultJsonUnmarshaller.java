/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response RegisterDeviceResult
 */
public class RegisterDeviceResultJsonUnmarshaller implements
        Unmarshaller<RegisterDeviceResult, JsonUnmarshallerContext> {

    public RegisterDeviceResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        RegisterDeviceResult registerDeviceResult = new RegisterDeviceResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DeviceId")) {
                registerDeviceResult.setDeviceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return registerDeviceResult;
    }

    private static RegisterDeviceResultJsonUnmarshaller instance;

    public static RegisterDeviceResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RegisterDeviceResultJsonUnmarshaller();
        return instance;
    }
}
