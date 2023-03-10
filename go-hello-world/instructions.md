1. Utwórz plik Dockerfile dla aplikacji restowej w języku Go.
   a) Katalogiem roboczym będzie `/src/app` 
   b) Na początku należy uruchomic polecenie `go mod init gohelloworld`
   c) Aby uruchomic aplikację, należy uruchomic polecenie `go run main.go`
   d) Aplikacja w Go nasłuchuje na porcie `8080`.

2. Upewnij się, że ten plik oraz plik Dockerfile nie trafią do kontenera

3. Zbuduj obraz i oznacz go nazwą `<DockerId>/go-hello-world:1.0.0`.

4. Uruchom aplikację w kontenerze z odpowiednimi portami i woluminami
