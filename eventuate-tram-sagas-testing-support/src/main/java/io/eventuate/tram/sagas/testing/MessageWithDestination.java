package io.eventuate.tram.sagas.testing;

import io.eventuate.tram.messaging.common.Message;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class MessageWithDestination {
  private final String destination;
  private final Message message;

  @Override
  public String toString() {
    return ToStringBuilder.reflectionToString(this);
  }

  public MessageWithDestination(String destination, Message message) {
    this.destination = destination;
    this.message = message;
  }

  public String getDestination() {
    return destination;
  }

  public Message getMessage() {
    return message;
  }
}
