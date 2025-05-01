Write-Output "Applying deployments started"

$deploymentsFolder = ".\k8s\deployments"
$deployments = Get-ChildItem -Path $deploymentsFolder -File

foreach ($deployment in $deployments) {
    Write-Output "Processing: $deployment.Name"
    kubectl apply -f $deployment.FullName
}
Write-Output "Applying deployments finished"

Write-Output "Applying service started"
$servicePath = "./k8s/microservice-service.yaml"
kubectl apply -f $servicePath
Write-Output "Applying service finished"

Write-Output "================================================"
kubectl get svc
minikube ip
Write-Output "================================================"
Write-Output "DONE"

read-host