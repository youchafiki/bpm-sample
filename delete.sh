kubectl -n gitlab-managed-apps delete ing bpm-sample
kubectl -n gitlab-managed-apps delete service bpm-sample
kubectl -n gitlab-managed-apps delete deployment bpm-sample
kubectl -n gitlab-managed-apps delete configmap bpm-sample.v1
kubectl -n gitlab-managed-apps delete secret bpm-sample
exit 0
