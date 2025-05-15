Запуск контейнера Jenkins в Docker:

```
docker run -d -p 8080:8080 -p 50000:50000 -v "C:\Users\Алексей\YandexDisk\Образование\ВУЗ\ВКР\Программные компоненты\Diploma\test-environment\jenkins\jenkins_home":/var/jenkins_home jenkins/jenkins:lts
```