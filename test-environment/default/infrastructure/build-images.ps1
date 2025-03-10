$servicesNames = @('ProductCatalogManagement', 'ClientManagement', 'ClientProfiles', 'OrderManagement',
'OrderProcessing', '', 'WarehouseManagement', 'Notifications', 'EmailService', 'Analytics', 'Reports', 'Logging')
$imagesNames = @('product-catalog-management', 'client-management', 'client-profiles', 'order-management',
'order-processing', '', 'warehouse-management', 'notifications', 'email-service', 'analytics', 'reports', 'logging')

Write-Output "Maven package started"
for ($i = 0; $i -lt $servicesNames.Length; $i++) {
    if ($i -eq 5) {
        continue
    }

    $serviceInd = $i + 1
    $serviceName = $servicesNames[$i]
    $imageName = $imagesNames[$i]
    $pomPath = "../micro-$serviceInd-$imageName/$serviceName/pom.xml"
    Write-Output "Processing: $pomPath"
    mvn -f $pomPath package
}
Write-Output "Maven package finished successfully"

Write-Output "Docker image building started"
for ($i = 0; $i -lt $servicesNames.Length; $i++) {
    if ($i -eq 5) {
        continue
    }

    $serviceInd = $i + 1
    $serviceName = $servicesNames[$i]
    $imageName = $imagesNames[$i]
    $serviceFolder = "../micro-$serviceInd-$imageName/$serviceName/"
    Write-Output "Processing: $serviceFolder"
    docker build -t $imageName $serviceFolder
}
Write-Output "Docker image building finished successfully"
Write-Output "============================================================"
Write-Output "DONE"
read-host