$imagesNames = @('product-catalog-management', 'client-management', 'client-profiles', 'order-management',
'order-processing', '', 'warehouse-management', 'notifications', 'email-service', 'analytics', 'reports', 'logging')

Write-Output "Loading images into minikube started"
for ($i = 0; $i -lt $imagesNames.Length; $i++) {
    if ($i -eq 5) {
        continue
    }
    $imageName = $imagesNames[$i]
    Write-Output "Processing: $imageName"
    minikube image load $imageName
}
Write-Output "Loading images into minikube finished"



read-host