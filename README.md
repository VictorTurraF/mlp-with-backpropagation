# mlp-with-backpropagation
Perceptron de multicamadas para processar o conjunto de dados de flores Iris

## Integrantes

- Samuel dos Santos Silva RA: 577588
- Gabriel Dutra Nascimento RA: 578266
- Vinicius Lucas dos Santos RA: 580694
- Victor Turra Florêncio RA: 580899

## Exemplo da saída do nosso programa
```
Iniciando treino [MLP-6] ...
Iniciando treino [MLP-5] ...
Iniciando treino [MLP-8] ...
Iniciando treino [MLP-7] ...
Iniciando treino [MLP-1] ...
Iniciando treino [MLP-4] ...
Iniciando treino [MLP-0] ...
Iniciando treino [MLP-3] ...
Iniciando treino [MLP-2] ...
Iniciando treino [MLP-9] ...

Finalizados os treinos! 

Testes: 
Resultados da rede MLP-0

Total de etapas: 10249
Convergiu?  Sim 

6,7 3,0 5,2 2,3 = 0,4930 (Iris-Virginica)
6,3 2,5 5,0 1,9 = 0,4916 (Iris-Virginica)
6,5 3,0 5,2 2,0 = 0,4917 (Iris-Virginica)
6,2 3,4 5,4 2,3 = 0,4910 (Iris-Virginica)
5,9 3,0 5,1 1,8 = 0,4911 (Iris-Virginica)
5,1 3,8 1,9 0,4 = 0,0011 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0007 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0004 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0005 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0003 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0004 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,9980 (Iris-Versicolor)
5,7 2,9 4,2 1,3 = 0,9979 (Iris-Versicolor)
6,2 2,9 4,3 1,3 = 0,9980 (Iris-Versicolor)
5,1 2,5 3,0 1,1 = 0,9977 (Iris-Versicolor)
5,7 2,8 4,1 1,3 = 0,9980 (Iris-Versicolor)

✔ Acertos: 16/16
✘ Erros: 0/16

Resultados da rede MLP-1

Total de etapas: 100000
Convergiu?  Não 

6,7 3,0 5,2 2,3 = 0,6327 
6,3 2,5 5,0 1,9 = 0,6327 
6,5 3,0 5,2 2,0 = 0,6327 
6,2 3,4 5,4 2,3 = 0,6327 
5,9 3,0 5,1 1,8 = 0,6327 
5,1 3,8 1,9 0,4 = 0,0005 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0004 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0003 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0004 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0003 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0003 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,6327 
5,7 2,9 4,2 1,3 = 0,6327 
6,2 2,9 4,3 1,3 = 0,6327 
5,1 2,5 3,0 1,1 = 0,6326 
5,7 2,8 4,1 1,3 = 0,6327 

✔ Acertos: 6/16
✘ Erros: 10/16

Resultados da rede MLP-2

Total de etapas: 41130
Convergiu?  Sim 

6,7 3,0 5,2 2,3 = 0,4991 (Iris-Virginica)
6,3 2,5 5,0 1,9 = 0,4977 (Iris-Virginica)
6,5 3,0 5,2 2,0 = 0,4978 (Iris-Virginica)
6,2 3,4 5,4 2,3 = 0,4971 (Iris-Virginica)
5,9 3,0 5,1 1,8 = 0,4972 (Iris-Virginica)
5,1 3,8 1,9 0,4 = 0,0021 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0021 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0021 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0021 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0021 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0021 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,9980 (Iris-Versicolor)
5,7 2,9 4,2 1,3 = 0,9980 (Iris-Versicolor)
6,2 2,9 4,3 1,3 = 0,9981 (Iris-Versicolor)
5,1 2,5 3,0 1,1 = 0,9980 (Iris-Versicolor)
5,7 2,8 4,1 1,3 = 0,9981 (Iris-Versicolor)

✔ Acertos: 16/16
✘ Erros: 0/16

Resultados da rede MLP-3

Total de etapas: 8261
Convergiu?  Sim 

6,7 3,0 5,2 2,3 = 0,4946 (Iris-Virginica)
6,3 2,5 5,0 1,9 = 0,5163 (Iris-Virginica)
6,5 3,0 5,2 2,0 = 0,4906 (Iris-Virginica)
6,2 3,4 5,4 2,3 = 0,4845 (Iris-Virginica)
5,9 3,0 5,1 1,8 = 0,4865 (Iris-Virginica)
5,1 3,8 1,9 0,4 = 0,0003 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0005 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0003 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0003 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0003 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0004 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,9977 (Iris-Versicolor)
5,7 2,9 4,2 1,3 = 0,9976 (Iris-Versicolor)
6,2 2,9 4,3 1,3 = 0,9979 (Iris-Versicolor)
5,1 2,5 3,0 1,1 = 0,9969 (Iris-Versicolor)
5,7 2,8 4,1 1,3 = 0,9979 (Iris-Versicolor)

✔ Acertos: 16/16
✘ Erros: 0/16

Resultados da rede MLP-4

Total de etapas: 100000
Convergiu?  Não 

6,7 3,0 5,2 2,3 = 0,6327 
6,3 2,5 5,0 1,9 = 0,6327 
6,5 3,0 5,2 2,0 = 0,6327 
6,2 3,4 5,4 2,3 = 0,6327 
5,9 3,0 5,1 1,8 = 0,6327 
5,1 3,8 1,9 0,4 = 0,0006 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0005 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0003 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0004 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0003 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0003 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,6327 
5,7 2,9 4,2 1,3 = 0,6327 
6,2 2,9 4,3 1,3 = 0,6327 
5,1 2,5 3,0 1,1 = 0,6326 
5,7 2,8 4,1 1,3 = 0,6327 

✔ Acertos: 6/16
✘ Erros: 10/16

Resultados da rede MLP-5

Total de etapas: 23655
Convergiu?  Sim 

6,7 3,0 5,2 2,3 = 0,4940 (Iris-Virginica)
6,3 2,5 5,0 1,9 = 0,4926 (Iris-Virginica)
6,5 3,0 5,2 2,0 = 0,4927 (Iris-Virginica)
6,2 3,4 5,4 2,3 = 0,4921 (Iris-Virginica)
5,9 3,0 5,1 1,8 = 0,4922 (Iris-Virginica)
5,1 3,8 1,9 0,4 = 0,0016 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0017 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0015 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0016 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0014 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0015 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 1,0000 (Iris-Versicolor)
5,7 2,9 4,2 1,3 = 1,0000 (Iris-Versicolor)
6,2 2,9 4,3 1,3 = 1,0000 (Iris-Versicolor)
5,1 2,5 3,0 1,1 = 1,0000 (Iris-Versicolor)
5,7 2,8 4,1 1,3 = 1,0000 (Iris-Versicolor)

✔ Acertos: 16/16
✘ Erros: 0/16

Resultados da rede MLP-6

Total de etapas: 100000
Convergiu?  Não 

6,7 3,0 5,2 2,3 = 0,6327 
6,3 2,5 5,0 1,9 = 0,6327 
6,5 3,0 5,2 2,0 = 0,6327 
6,2 3,4 5,4 2,3 = 0,6327 
5,9 3,0 5,1 1,8 = 0,6327 
5,1 3,8 1,9 0,4 = 0,0005 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0004 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0003 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0004 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0003 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0003 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,6327 
5,7 2,9 4,2 1,3 = 0,6327 
6,2 2,9 4,3 1,3 = 0,6327 
5,1 2,5 3,0 1,1 = 0,6326 
5,7 2,8 4,1 1,3 = 0,6327 

✔ Acertos: 6/16
✘ Erros: 10/16

Resultados da rede MLP-7

Total de etapas: 100000
Convergiu?  Não 

6,7 3,0 5,2 2,3 = 0,5447 (Iris-Virginica)
6,3 2,5 5,0 1,9 = 0,5447 (Iris-Virginica)
6,5 3,0 5,2 2,0 = 0,5447 (Iris-Virginica)
6,2 3,4 5,4 2,3 = 0,5447 (Iris-Virginica)
5,9 3,0 5,1 1,8 = 0,5447 (Iris-Virginica)
5,1 3,8 1,9 0,4 = 0,0003 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0002 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0001 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0002 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0001 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0001 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,5447 (Iris-Virginica)
5,7 2,9 4,2 1,3 = 0,5447 (Iris-Virginica)
6,2 2,9 4,3 1,3 = 0,5447 (Iris-Virginica)
5,1 2,5 3,0 1,1 = 0,5446 (Iris-Virginica)
5,7 2,8 4,1 1,3 = 0,5447 (Iris-Virginica)

✔ Acertos: 11/16
✘ Erros: 5/16

Resultados da rede MLP-8

Total de etapas: 100000
Convergiu?  Não 

6,7 3,0 5,2 2,3 = 0,6327 
6,3 2,5 5,0 1,9 = 0,6327 
6,5 3,0 5,2 2,0 = 0,6327 
6,2 3,4 5,4 2,3 = 0,6327 
5,9 3,0 5,1 1,8 = 0,6327 
5,1 3,8 1,9 0,4 = 0,0004 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0002 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0001 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0002 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0001 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0001 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,6327 
5,7 2,9 4,2 1,3 = 0,6327 
6,2 2,9 4,3 1,3 = 0,6327 
5,1 2,5 3,0 1,1 = 0,6326 
5,7 2,8 4,1 1,3 = 0,6327 

✔ Acertos: 6/16
✘ Erros: 10/16

Resultados da rede MLP-9

Total de etapas: 100000
Convergiu?  Não 

6,7 3,0 5,2 2,3 = 0,6327 
6,3 2,5 5,0 1,9 = 0,6327 
6,5 3,0 5,2 2,0 = 0,6327 
6,2 3,4 5,4 2,3 = 0,6327 
5,9 3,0 5,1 1,8 = 0,6327 
5,1 3,8 1,9 0,4 = 0,0005 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0004 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0003 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0004 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0003 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0004 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,6327 
5,7 2,9 4,2 1,3 = 0,6327 
6,2 2,9 4,3 1,3 = 0,6327 
5,1 2,5 3,0 1,1 = 0,6326 
5,7 2,8 4,1 1,3 = 0,6327 

✔ Acertos: 6/16
✘ Erros: 10/16


Melhor rede neural: MLP-0
Total de redes que convergiram: 4
Total de redes que não convergiram: 6

Process finished with exit code 0
```
