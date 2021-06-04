# mlp-with-backpropagation
Perceptron de multicamadas para processar o conjunto de dados de flores Iris

## Integrantes

- Samuel dos Santos Silva RA: 577588
- Gabriel Dutra Nascimento RA: 578266
- Vinicius Lucas dos Santos RA: 580694
- Victor Turra Florêncio RA: 580899

## Exemplo da saída do nosso programa
```
Iniciando treino [MLP-3] ...
Iniciando treino [MLP-5] ...
Iniciando treino [MLP-4] ...
Iniciando treino [MLP-6] ...
Iniciando treino [MLP-9] ...
Iniciando treino [MLP-1] ...
Iniciando treino [MLP-7] ...
Iniciando treino [MLP-0] ...
Iniciando treino [MLP-2] ...
Iniciando treino [MLP-8] ...

Finalizados os treinos! 

Testes: 
Resultados da rede MLP-0

Total de etapas: 8326
Convergiu?  Sim 

6,7 3,0 5,2 2,3 = 0,5191 (Iris-Virginica)
6,3 2,5 5,0 1,9 = 0,5179 (Iris-Virginica)
6,5 3,0 5,2 2,0 = 0,5177 (Iris-Virginica)
6,2 3,4 5,4 2,3 = 0,5167 (Iris-Virginica)
5,9 3,0 5,1 1,8 = 0,5171 (Iris-Virginica)
5,1 3,8 1,9 0,4 = 0,0019 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0020 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0018 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0019 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0018 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0019 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,9975 (Iris-Versicolor)
5,7 2,9 4,2 1,3 = 0,9974 (Iris-Versicolor)
6,2 2,9 4,3 1,3 = 0,9975 (Iris-Versicolor)
5,1 2,5 3,0 1,1 = 0,9971 (Iris-Versicolor)
5,7 2,8 4,1 1,3 = 0,9975 (Iris-Versicolor)

✔ Acertos: 16/16
✘ Erros: 0/16

Resultados da rede MLP-1

Total de etapas: 8319
Convergiu?  Sim 

6,7 3,0 5,2 2,3 = 0,5110 (Iris-Virginica)
6,3 2,5 5,0 1,9 = 0,5206 (Iris-Virginica)
6,5 3,0 5,2 2,0 = 0,5052 (Iris-Virginica)
6,2 3,4 5,4 2,3 = 0,4882 (Iris-Virginica)
5,9 3,0 5,1 1,8 = 0,4954 (Iris-Virginica)
5,1 3,8 1,9 0,4 = 0,0023 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0024 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0021 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0023 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0022 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0023 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,9980 (Iris-Versicolor)
5,7 2,9 4,2 1,3 = 0,9979 (Iris-Versicolor)
6,2 2,9 4,3 1,3 = 0,9981 (Iris-Versicolor)
5,1 2,5 3,0 1,1 = 0,9977 (Iris-Versicolor)
5,7 2,8 4,1 1,3 = 0,9981 (Iris-Versicolor)

✔ Acertos: 16/16
✘ Erros: 0/16

Resultados da rede MLP-2

Total de etapas: 8142
Convergiu?  Sim 

6,7 3,0 5,2 2,3 = 0,4947 (Iris-Virginica)
6,3 2,5 5,0 1,9 = 0,5164 (Iris-Virginica)
6,5 3,0 5,2 2,0 = 0,4905 (Iris-Virginica)
6,2 3,4 5,4 2,3 = 0,4844 (Iris-Virginica)
5,9 3,0 5,1 1,8 = 0,4863 (Iris-Virginica)
5,1 3,8 1,9 0,4 = 0,0003 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0006 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0003 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0004 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0003 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0004 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,9977 (Iris-Versicolor)
5,7 2,9 4,2 1,3 = 0,9976 (Iris-Versicolor)
6,2 2,9 4,3 1,3 = 0,9979 (Iris-Versicolor)
5,1 2,5 3,0 1,1 = 0,9964 (Iris-Versicolor)
5,7 2,8 4,1 1,3 = 0,9979 (Iris-Versicolor)

✔ Acertos: 16/16
✘ Erros: 0/16

Resultados da rede MLP-3

Total de etapas: 11188
Convergiu?  Sim 

6,7 3,0 5,2 2,3 = 0,4950 (Iris-Virginica)
6,3 2,5 5,0 1,9 = 0,4936 (Iris-Virginica)
6,5 3,0 5,2 2,0 = 0,4937 (Iris-Virginica)
6,2 3,4 5,4 2,3 = 0,4930 (Iris-Virginica)
5,9 3,0 5,1 1,8 = 0,4931 (Iris-Virginica)
5,1 3,8 1,9 0,4 = 0,0023 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0024 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0022 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0023 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0022 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0023 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,9983 (Iris-Versicolor)
5,7 2,9 4,2 1,3 = 0,9982 (Iris-Versicolor)
6,2 2,9 4,3 1,3 = 0,9983 (Iris-Versicolor)
5,1 2,5 3,0 1,1 = 0,9980 (Iris-Versicolor)
5,7 2,8 4,1 1,3 = 0,9983 (Iris-Versicolor)

✔ Acertos: 16/16
✘ Erros: 0/16

Resultados da rede MLP-4

Total de etapas: 9693
Convergiu?  Sim 

6,7 3,0 5,2 2,3 = 0,4921 (Iris-Virginica)
6,3 2,5 5,0 1,9 = 0,4905 (Iris-Virginica)
6,5 3,0 5,2 2,0 = 0,4906 (Iris-Virginica)
6,2 3,4 5,4 2,3 = 0,4899 (Iris-Virginica)
5,9 3,0 5,1 1,8 = 0,4900 (Iris-Virginica)
5,1 3,8 1,9 0,4 = 0,0000 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0000 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0000 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0000 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0000 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0000 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,9943 (Iris-Versicolor)
5,7 2,9 4,2 1,3 = 0,9942 (Iris-Versicolor)
6,2 2,9 4,3 1,3 = 0,9943 (Iris-Versicolor)
5,1 2,5 3,0 1,1 = 0,9942 (Iris-Versicolor)
5,7 2,8 4,1 1,3 = 0,9943 (Iris-Versicolor)

✔ Acertos: 16/16
✘ Erros: 0/16

Resultados da rede MLP-5

Total de etapas: 9958
Convergiu?  Sim 

6,7 3,0 5,2 2,3 = 0,4991 (Iris-Virginica)
6,3 2,5 5,0 1,9 = 0,4977 (Iris-Virginica)
6,5 3,0 5,2 2,0 = 0,4978 (Iris-Virginica)
6,2 3,4 5,4 2,3 = 0,4971 (Iris-Virginica)
5,9 3,0 5,1 1,8 = 0,4972 (Iris-Virginica)
5,1 3,8 1,9 0,4 = 0,0022 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0022 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0021 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0021 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0021 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0021 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,9980 (Iris-Versicolor)
5,7 2,9 4,2 1,3 = 0,9979 (Iris-Versicolor)
6,2 2,9 4,3 1,3 = 0,9980 (Iris-Versicolor)
5,1 2,5 3,0 1,1 = 0,9975 (Iris-Versicolor)
5,7 2,8 4,1 1,3 = 0,9980 (Iris-Versicolor)

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
5,0 3,3 1,4 0,2 = 0,0004 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,6327 
5,7 2,9 4,2 1,3 = 0,6327 
6,2 2,9 4,3 1,3 = 0,6327 
5,1 2,5 3,0 1,1 = 0,6326 
5,7 2,8 4,1 1,3 = 0,6327 

✔ Acertos: 6/16
✘ Erros: 10/16

Resultados da rede MLP-7

Total de etapas: 6648
Convergiu?  Sim 

6,7 3,0 5,2 2,3 = 0,5059 (Iris-Virginica)
6,3 2,5 5,0 1,9 = 0,5469 (Iris-Virginica)
6,5 3,0 5,2 2,0 = 0,4954 (Iris-Virginica)
6,2 3,4 5,4 2,3 = 0,4874 (Iris-Virginica)
5,9 3,0 5,1 1,8 = 0,4884 (Iris-Virginica)
5,1 3,8 1,9 0,4 = 0,0028 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0035 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0031 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0033 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0032 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0033 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,9978 (Iris-Versicolor)
5,7 2,9 4,2 1,3 = 0,9978 (Iris-Versicolor)
6,2 2,9 4,3 1,3 = 0,9985 (Iris-Versicolor)
5,1 2,5 3,0 1,1 = 0,9989 (Iris-Versicolor)
5,7 2,8 4,1 1,3 = 0,9982 (Iris-Versicolor)

✔ Acertos: 16/16
✘ Erros: 0/16

Resultados da rede MLP-8

Total de etapas: 9634
Convergiu?  Sim 

6,7 3,0 5,2 2,3 = 0,4930 (Iris-Virginica)
6,3 2,5 5,0 1,9 = 0,4917 (Iris-Virginica)
6,5 3,0 5,2 2,0 = 0,4917 (Iris-Virginica)
6,2 3,4 5,4 2,3 = 0,4910 (Iris-Virginica)
5,9 3,0 5,1 1,8 = 0,4912 (Iris-Virginica)
5,1 3,8 1,9 0,4 = 0,0015 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0014 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0011 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0013 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0011 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0012 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,9983 (Iris-Versicolor)
5,7 2,9 4,2 1,3 = 0,9982 (Iris-Versicolor)
6,2 2,9 4,3 1,3 = 0,9983 (Iris-Versicolor)
5,1 2,5 3,0 1,1 = 0,9978 (Iris-Versicolor)
5,7 2,8 4,1 1,3 = 0,9983 (Iris-Versicolor)

✔ Acertos: 16/16
✘ Erros: 0/16

Resultados da rede MLP-9

Total de etapas: 100000
Convergiu?  Não 

6,7 3,0 5,2 2,3 = 0,5480 (Iris-Virginica)
6,3 2,5 5,0 1,9 = 0,5480 (Iris-Virginica)
6,5 3,0 5,2 2,0 = 0,5480 (Iris-Virginica)
6,2 3,4 5,4 2,3 = 0,5480 (Iris-Virginica)
5,9 3,0 5,1 1,8 = 0,5480 (Iris-Virginica)
5,1 3,8 1,9 0,4 = 0,0005 (Iris-Setosa)
4,8 3,0 1,4 0,3 = 0,0004 (Iris-Setosa)
5,1 3,8 1,6 0,2 = 0,0003 (Iris-Setosa)
4,6 3,2 1,4 0,2 = 0,0004 (Iris-Setosa)
5,3 3,7 1,5 0,2 = 0,0003 (Iris-Setosa)
5,0 3,3 1,4 0,2 = 0,0003 (Iris-Setosa)
5,7 3,0 4,2 1,2 = 0,5480 (Iris-Virginica)
5,7 2,9 4,2 1,3 = 0,5480 (Iris-Virginica)
6,2 2,9 4,3 1,3 = 0,5480 (Iris-Virginica)
5,1 2,5 3,0 1,1 = 0,5479 (Iris-Virginica)
5,7 2,8 4,1 1,3 = 0,5480 (Iris-Virginica)

✔ Acertos: 11/16
✘ Erros: 5/16


Melhor rede neural: MLP-0
Total de redes que convergiram: 8
Total de redes que não convergiram: 2

Process finished with exit code 0
```
