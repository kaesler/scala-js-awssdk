package com.definitelyscala.awssdk.Swf

import scala.scalajs.js

@js.native
trait ChildWorkflowExecutionTimedOutEventAttributes extends js.Object {
  var workflowExecution: WorkflowExecution = js.native
  var workflowType: WorkflowType = js.native
  var timeoutType: String = js.native
  var initiatedEventId: Double = js.native
  var startedEventId: Double = js.native
}