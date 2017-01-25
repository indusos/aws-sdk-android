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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

public class MessageConfiguration implements Serializable {
    /**
     * The message that the campaign delivers to APNS channels. Overrides the
     * default message.
     */
    private Message aPNSMessage;

    /**
     * The default message for all channels.
     */
    private Message defaultMessage;

    /**
     * The message that the campaign delivers to GCM channels. Overrides the
     * default message.
     */
    private Message gCMMessage;

    /**
     * The message that the campaign delivers to APNS channels. Overrides the
     * default message.
     *
     * @return The message that the campaign delivers to APNS channels.
     *         Overrides the default message.
     */
    public Message getAPNSMessage() {
        return aPNSMessage;
    }

    /**
     * The message that the campaign delivers to APNS channels. Overrides the
     * default message.
     *
     * @param aPNSMessage The message that the campaign delivers to APNS
     *            channels. Overrides the default message.
     */
    public void setAPNSMessage(Message aPNSMessage) {
        this.aPNSMessage = aPNSMessage;
    }

    /**
     * The message that the campaign delivers to APNS channels. Overrides the
     * default message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param aPNSMessage The message that the campaign delivers to APNS
     *            channels. Overrides the default message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageConfiguration withAPNSMessage(Message aPNSMessage) {
        this.aPNSMessage = aPNSMessage;
        return this;
    }

    /**
     * The default message for all channels.
     *
     * @return The default message for all channels.
     */
    public Message getDefaultMessage() {
        return defaultMessage;
    }

    /**
     * The default message for all channels.
     *
     * @param defaultMessage The default message for all channels.
     */
    public void setDefaultMessage(Message defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    /**
     * The default message for all channels.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param defaultMessage The default message for all channels.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageConfiguration withDefaultMessage(Message defaultMessage) {
        this.defaultMessage = defaultMessage;
        return this;
    }

    /**
     * The message that the campaign delivers to GCM channels. Overrides the
     * default message.
     *
     * @return The message that the campaign delivers to GCM channels. Overrides
     *         the default message.
     */
    public Message getGCMMessage() {
        return gCMMessage;
    }

    /**
     * The message that the campaign delivers to GCM channels. Overrides the
     * default message.
     *
     * @param gCMMessage The message that the campaign delivers to GCM channels.
     *            Overrides the default message.
     */
    public void setGCMMessage(Message gCMMessage) {
        this.gCMMessage = gCMMessage;
    }

    /**
     * The message that the campaign delivers to GCM channels. Overrides the
     * default message.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param gCMMessage The message that the campaign delivers to GCM channels.
     *            Overrides the default message.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MessageConfiguration withGCMMessage(Message gCMMessage) {
        this.gCMMessage = gCMMessage;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAPNSMessage() != null)
            sb.append("APNSMessage: " + getAPNSMessage() + ",");
        if (getDefaultMessage() != null)
            sb.append("DefaultMessage: " + getDefaultMessage() + ",");
        if (getGCMMessage() != null)
            sb.append("GCMMessage: " + getGCMMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAPNSMessage() == null) ? 0 : getAPNSMessage().hashCode());
        hashCode = prime * hashCode
                + ((getDefaultMessage() == null) ? 0 : getDefaultMessage().hashCode());
        hashCode = prime * hashCode + ((getGCMMessage() == null) ? 0 : getGCMMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageConfiguration == false)
            return false;
        MessageConfiguration other = (MessageConfiguration) obj;

        if (other.getAPNSMessage() == null ^ this.getAPNSMessage() == null)
            return false;
        if (other.getAPNSMessage() != null
                && other.getAPNSMessage().equals(this.getAPNSMessage()) == false)
            return false;
        if (other.getDefaultMessage() == null ^ this.getDefaultMessage() == null)
            return false;
        if (other.getDefaultMessage() != null
                && other.getDefaultMessage().equals(this.getDefaultMessage()) == false)
            return false;
        if (other.getGCMMessage() == null ^ this.getGCMMessage() == null)
            return false;
        if (other.getGCMMessage() != null
                && other.getGCMMessage().equals(this.getGCMMessage()) == false)
            return false;
        return true;
    }
}
