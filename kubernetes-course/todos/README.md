Instalacja 

* Usuń wszystkie obiekty (nie może by konfliktów)
    kubectl delete all --all --all-namespaces
* Usuń namespace dla ingresu
    kubectl delete namespace ingress-nginx
* Usuń instalację todos (jeśli istnieje)
  helm delete todos
* Zainstaluj paczkę
  helm install todos todos/ --values todos/values.yaml
