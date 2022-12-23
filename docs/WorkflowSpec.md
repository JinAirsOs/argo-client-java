

# WorkflowSpec

WorkflowSpec is the specification of a Workflow.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeDeadlineSeconds** | **Integer** | Optional duration in seconds relative to the workflow start time which the workflow is allowed to run before the controller terminates the io.argoproj.workflow.v1alpha1. A value of zero is used to terminate a Running workflow |  [optional]
**affinity** | [**V1Affinity**](V1Affinity.md) |  |  [optional]
**archiveLogs** | **Boolean** | ArchiveLogs indicates if the container logs should be archived |  [optional]
**arguments** | [**Arguments**](Arguments.md) |  |  [optional]
**artifactRepositoryRef** | [**ArtifactRepositoryRef**](ArtifactRepositoryRef.md) |  |  [optional]
**automountServiceAccountToken** | **Boolean** | AutomountServiceAccountToken indicates whether a service account token should be automatically mounted in pods. ServiceAccountName of ExecutorConfig must be specified if this value is false. |  [optional]
**dnsConfig** | [**V1PodDNSConfig**](V1PodDNSConfig.md) |  |  [optional]
**dnsPolicy** | **String** | Set DNS policy for the pod. Defaults to \&quot;ClusterFirst\&quot;. Valid values are &#39;ClusterFirstWithHostNet&#39;, &#39;ClusterFirst&#39;, &#39;Default&#39; or &#39;None&#39;. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to &#39;ClusterFirstWithHostNet&#39;. |  [optional]
**entrypoint** | **String** | Entrypoint is a template reference to the starting point of the io.argoproj.workflow.v1alpha1. |  [optional]
**executor** | [**ExecutorConfig**](ExecutorConfig.md) |  |  [optional]
**hooks** | [**Map&lt;String, LifecycleHook&gt;**](LifecycleHook.md) | Hooks holds the lifecycle hook which is invoked at lifecycle of step, irrespective of the success, failure, or error status of the primary step |  [optional]
**hostAliases** | [**List&lt;V1HostAlias&gt;**](V1HostAlias.md) |  |  [optional]
**hostNetwork** | **Boolean** | Host networking requested for this workflow pod. Default to false. |  [optional]
**imagePullSecrets** | [**List&lt;V1LocalObjectReference&gt;**](V1LocalObjectReference.md) | ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod |  [optional]
**metrics** | [**Metrics**](Metrics.md) |  |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which will result in all pods of the workflow to be scheduled on the selected node(s). This is able to be overridden by a nodeSelector specified in the template. |  [optional]
**onExit** | **String** | OnExit is a template reference which is invoked at the end of the workflow, irrespective of the success, failure, or error of the primary io.argoproj.workflow.v1alpha1. |  [optional]
**parallelism** | **Integer** | Parallelism limits the max total parallel pods that can execute at the same time in a workflow |  [optional]
**podDisruptionBudget** | [**PodDisruptionBudgetSpec**](PodDisruptionBudgetSpec.md) |  |  [optional]
**podGC** | [**PodGC**](PodGC.md) |  |  [optional]
**podMetadata** | [**Metadata**](Metadata.md) |  |  [optional]
**podPriority** | **Integer** | Priority to apply to workflow pods. |  [optional]
**podPriorityClassName** | **String** | PriorityClassName to apply to workflow pods. |  [optional]
**podSpecPatch** | **String** | PodSpecPatch holds strategic merge patch to apply against the pod spec. Allows parameterization of container fields which are not strings (e.g. resource limits). |  [optional]
**priority** | **Integer** | Priority is used if controller is configured to process limited number of workflows in parallel. Workflows with higher priority are processed first. |  [optional]
**retryStrategy** | [**RetryStrategy**](RetryStrategy.md) |  |  [optional]
**schedulerName** | **String** | Set scheduler name for all pods. Will be overridden if container/script template&#39;s scheduler name is set. Default scheduler will be used if neither specified. |  [optional]
**securityContext** | [**V1PodSecurityContext**](V1PodSecurityContext.md) |  |  [optional]
**serviceAccountName** | **String** | ServiceAccountName is the name of the ServiceAccount to run all pods of the workflow as. |  [optional]
**shutdown** | **String** | Shutdown will shutdown the workflow according to its ShutdownStrategy |  [optional]
**suspend** | **Boolean** | Suspend will suspend the workflow and prevent execution of any future steps in the workflow |  [optional]
**synchronization** | [**Synchronization**](Synchronization.md) |  |  [optional]
**templateDefaults** | [**Template**](Template.md) |  |  [optional]
**templates** | [**List&lt;Template&gt;**](Template.md) | Templates is a list of workflow templates used in a workflow |  [optional]
**tolerations** | [**List&lt;V1Toleration&gt;**](V1Toleration.md) | Tolerations to apply to workflow pods. |  [optional]
**ttlStrategy** | [**TTLStrategy**](TTLStrategy.md) |  |  [optional]
**volumeClaimGC** | [**VolumeClaimGC**](VolumeClaimGC.md) |  |  [optional]
**volumeClaimTemplates** | [**List&lt;V1PersistentVolumeClaim&gt;**](V1PersistentVolumeClaim.md) | VolumeClaimTemplates is a list of claims that containers are allowed to reference. The Workflow controller will create the claims at the beginning of the workflow and delete the claims upon completion of the workflow |  [optional]
**volumes** | [**List&lt;V1Volume&gt;**](V1Volume.md) | Volumes is a list of volumes that can be mounted by containers in a io.argoproj.workflow.v1alpha1. |  [optional]
**workflowMetadata** | [**WorkflowMetadata**](WorkflowMetadata.md) |  |  [optional]
**workflowTemplateRef** | [**WorkflowTemplateRef**](WorkflowTemplateRef.md) |  |  [optional]



