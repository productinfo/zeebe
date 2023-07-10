/*
 * Copyright © 2017 camunda services GmbH (info@camunda.com)
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
package io.camunda.zeebe.protocol.record.value;

import io.camunda.zeebe.protocol.record.ImmutableProtocol;
import io.camunda.zeebe.protocol.record.RecordValue;
import java.util.List;
import org.immutables.value.Value;

/**
 * Represents a message event or command.
 *
 * <p>See {@link io.camunda.zeebe.protocol.record.intent.MessageBatchIntent} for intents.
 */
@Value.Immutable
@ImmutableProtocol(builder = ImmutableMessageBatchRecordValue.Builder.class)
public interface MessageBatchRecordValue extends RecordValue {

  /**
   * @return list of the keys from the messages assigned to this batch
   */
  List<Long> getMessageKeys();
}
