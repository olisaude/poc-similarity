# poc-similarity

---
POC contruida com intuito de encontrar o melhor algoritmo de similaridade ou distancia

##Start

---

###Dicionário
- input = valor a ser comparado
- map = lista com o resultados dos algoritmos
- listObj = lista com os valores a ser comparados

-inputs:
    ``` 
    src/main/java/expected.kt
    ```

```kotlin
fun main(){
    //...
}
```

###Resultado 
Example:
```json 
[
  {
    "algorithm": "demerau",
    "score": 1,
    "input": "O RATO ROEU A ROUPA DO REI DE ROMA",
    "time": 0.002
  },
  {
    "algorithm": "cosSimilarity",
    "score": 1,
    "input": "O RATO ROEU A ROUPA DO REI DE ROMA",
    "time": 0.292
  },
  {
    "algorithm": "diceCoefficient",
    "score": 1,
    "input": "O RATO ROEU A ROUPA DO REI DE ROMA",
    "time": 0.055
  },
  {
    "algorithm": "hamming",
    "score": 1,
    "input": "O RATO ROEU A ROUPA DO REI DE ROMA",
    "time": 0.003
  },
  {
    "algorithm": "jaccard",
    "score": 1,
    "input": "O RATO ROEU A ROUPA DO REI DE ROMA",
    "time": 0.011
  },
  {
    "algorithm": "jaro",
    "score": 1,
    "input": "O RATO ROEU A ROUPA DO REI DE ROMA",
    "time": 0.018
  },
  {
    "algorithm": "jaroWinkler",
    "score": 1,
    "input": "O RATO ROEU A ROUPA DO REI DE ROMA",
    "time": 0.005
  },
  {
    "algorithm": "levenshtein",
    "score": 1,
    "input": "O RATO ROEU A ROUPA DO REI DE ROMA",
    "time": 0.005
  },
  {
    "algorithm": "needlemanWunsch",
    "score": 1,
    "input": "O RATO ROEU A ROUPA DO REI DE ROMA",
    "time": 0.002
  },
  {
    "algorithm": "nGram",
    "score": 1,
    "input": "O RATO ROEU A ROUPA DO REI DE ROMA",
    "time": 0.002
  },
  {
    "algorithm": "overlap",
    "score": 1,
    "input": "O RATO ROEU A ROUPA DO REI DE ROMA",
    "time": 0.002,
    "memory": 24632768
  },
  {
    "algorithm": "smithWaterman",
    "score": 1,
    "input": "O RATO ROEU A ROUPA DO REI DE ROMA",
    "time": 0.11
  },
  {
    "algorithm": "smithWatermanGotoh",
    "score": 0.9705882352941176,
    "input": "O RATO ROEU A ROUPA DO REI DE ROMA",
    "time": 0.01,
    "memory": 25681344
  },
  {
    "algorithm": "tversky",
    "score": 1,
    "input": "O RATO ROEU A ROUPA DO REI DE ROMA",
    "time": 0.003
  },
  {
    "algorithm": "damerauDist",
    "score": 0,
    "input": "O RATO ROEU A ROUPA DO REI DE ROMA",
    "time": 0
  },
  {
    "algorithm": "demerau",
    "score": 0.6176470588235294,
    "input": "O RATO ROEU ROUPA ROMA REI",
    "time": 0.001
  },
  {
    "algorithm": "cosSimilarity",
    "score": 0.9702692023881211,
    "input": "O RATO ROEU ROUPA ROMA REI",
    "time": 0.002
  },
  {
    "algorithm": "diceCoefficient",
    "score": 0.85,
    "input": "O RATO ROEU ROUPA ROMA REI",
    "time": 0.02
  },
  {
    "algorithm": "hamming",
    "score": 0,
    "input": "O RATO ROEU ROUPA ROMA REI",
    "time": 0
  },
  {
    "algorithm": "jaccard",
    "score": 0.7647058823529411,
    "input": "O RATO ROEU ROUPA ROMA REI",
    "time": 0.008
  },
  {
    "algorithm": "jaro",
    "score": 0,
    "input": "O RATO ROEU ROUPA ROMA REI",
    "time": 0
  },
  {
    "algorithm": "jaroWinkler",
    "score": 0.4,
    "input": "O RATO ROEU ROUPA ROMA REI",
    "time": 0
  },
  {
    "algorithm": "levenshtein",
    "score": 0.6176470588235294,
    "input": "O RATO ROEU ROUPA ROMA REI",
    "time": 0.001
  },
  {
    "algorithm": "needlemanWunsch",
    "score": 0.8382352941176471,
    "input": "O RATO ROEU ROUPA ROMA REI",
    "time": 0.006
  },
  {
    "algorithm": "nGram",
    "score": 0.7647058823529411,
    "input": "O RATO ROEU ROUPA ROMA REI",
    "time": 0.001
  },
  {
    "algorithm": "overlap",
    "score": 1,
    "input": "O RATO ROEU ROUPA ROMA REI",
    "time": 0.001,
    "memory": 26729920
  },
  {
    "algorithm": "smithWaterman",
    "score": 0.8846153846153846,
    "input": "O RATO ROEU ROUPA ROMA REI",
    "time": 0.001
  },
  {
    "algorithm": "smithWatermanGotoh",
    "score": 0.5769230769230769,
    "input": "O RATO ROEU ROUPA ROMA REI",
    "time": 0,
    "memory": 26729920
  },
  {
    "algorithm": "tversky",
    "score": 0.78125,
    "input": "O RATO ROEU ROUPA ROMA REI",
    "time": 0.006
  },
  {
    "algorithm": "damerauDist",
    "score": 13,
    "input": "O RATO ROEU ROUPA ROMA REI",
    "time": 0
  },
  {
    "algorithm": "demerau",
    "score": 0.38235294117647056,
    "input": "A ROUPA DO REI, O RATO ROEU",
    "time": 0
  },
  {
    "algorithm": "cosSimilarity",
    "score": 0.9870403534981965,
    "input": "A ROUPA DO REI, O RATO ROEU",
    "time": 0
  },
  {
    "algorithm": "diceCoefficient",
    "score": 0.7619047619047619,
    "input": "A ROUPA DO REI, O RATO ROEU",
    "time": 0.001
  },
  {
    "algorithm": "hamming",
    "score": 0,
    "input": "A ROUPA DO REI, O RATO ROEU",
    "time": 0
  },
  {
    "algorithm": "jaccard",
    "score": 0.7428571428571429,
    "input": "A ROUPA DO REI, O RATO ROEU",
    "time": 0.001
  },
  {
    "algorithm": "jaro",
    "score": 0,
    "input": "A ROUPA DO REI, O RATO ROEU",
    "time": 0
  },
  {
    "algorithm": "jaroWinkler",
    "score": 0,
    "input": "A ROUPA DO REI, O RATO ROEU",
    "time": 0.001
  },
  {
    "algorithm": "levenshtein",
    "score": 0.38235294117647056,
    "input": "A ROUPA DO REI, O RATO ROEU",
    "time": 0.001
  },
  {
    "algorithm": "needlemanWunsch",
    "score": 0.7647058823529411,
    "input": "A ROUPA DO REI, O RATO ROEU",
    "time": 0
  },
  {
    "algorithm": "nGram",
    "score": 0.7647058823529411,
    "input": "A ROUPA DO REI, O RATO ROEU",
    "time": 0.001
  },
  {
    "algorithm": "overlap",
    "score": 0.9629629629629629,
    "input": "A ROUPA DO REI, O RATO ROEU",
    "time": 0,
    "memory": 27252160
  },
  {
    "algorithm": "smithWaterman",
    "score": 0.6666666666666666,
    "input": "A ROUPA DO REI, O RATO ROEU",
    "time": 0.001
  },
  {
    "algorithm": "smithWatermanGotoh",
    "score": 0.5185185185185185,
    "input": "A ROUPA DO REI, O RATO ROEU",
    "time": 0,
    "memory": 27252160
  },
  {
    "algorithm": "tversky",
    "score": 0.696969696969697,
    "input": "A ROUPA DO REI, O RATO ROEU",
    "time": 0.001
  },
  {
    "algorithm": "damerauDist",
    "score": 21,
    "input": "A ROUPA DO REI, O RATO ROEU",
    "time": 0
  },
  {
    "algorithm": "demerau",
    "score": 0.38235294117647056,
    "input": "REI DE ROMA, O RATO ROEU A ROUPA",
    "time": 0
  },
  {
    "algorithm": "cosSimilarity",
    "score": 0.9909299375566979,
    "input": "REI DE ROMA, O RATO ROEU A ROUPA",
    "time": 0.002
  },
  {
    "algorithm": "diceCoefficient",
    "score": 0.9166666666666666,
    "input": "REI DE ROMA, O RATO ROEU A ROUPA",
    "time": 0.001
  },
  {
    "algorithm": "hamming",
    "score": 0,
    "input": "REI DE ROMA, O RATO ROEU A ROUPA",
    "time": 0
  },
  {
    "algorithm": "jaccard",
    "score": 0.8857142857142857,
    "input": "REI DE ROMA, O RATO ROEU A ROUPA",
    "time": 0.004
  },
  {
    "algorithm": "jaro",
    "score": 0,
    "input": "REI DE ROMA, O RATO ROEU A ROUPA",
    "time": 0
  },
  {
    "algorithm": "jaroWinkler",
    "score": 0,
    "input": "REI DE ROMA, O RATO ROEU A ROUPA",
    "time": 0
  },
  {
    "algorithm": "levenshtein",
    "score": 0.38235294117647056,
    "input": "REI DE ROMA, O RATO ROEU A ROUPA",
    "time": 0.001
  },
  {
    "algorithm": "needlemanWunsch",
    "score": 0.7647058823529411,
    "input": "REI DE ROMA, O RATO ROEU A ROUPA",
    "time": 0.001
  },
  {
    "algorithm": "nGram",
    "score": 0.9117647058823529,
    "input": "REI DE ROMA, O RATO ROEU A ROUPA",
    "time": 0
  },
  {
    "algorithm": "overlap",
    "score": 0.96875,
    "input": "REI DE ROMA, O RATO ROEU A ROUPA",
    "time": 0.001,
    "memory": 27778496
  },
  {
    "algorithm": "smithWaterman",
    "score": 0.59375,
    "input": "REI DE ROMA, O RATO ROEU A ROUPA",
    "time": 0.001
  },
  {
    "algorithm": "smithWatermanGotoh",
    "score": 0.59375,
    "input": "REI DE ROMA, O RATO ROEU A ROUPA",
    "time": 0,
    "memory": 27778496
  },
  {
    "algorithm": "tversky",
    "score": 0.875,
    "input": "REI DE ROMA, O RATO ROEU A ROUPA",
    "time": 0.001
  },
  {
    "algorithm": "damerauDist",
    "score": 21,
    "input": "REI DE ROMA, O RATO ROEU A ROUPA",
    "time": 0.001
  },
  {
    "algorithm": "demerau",
    "score": 0.7058823529411765,
    "input": "RATO ROEU ROUPA REI ROMA",
    "time": 0
  },
  {
    "algorithm": "cosSimilarity",
    "score": 0.9518729142857958,
    "input": "RATO ROEU ROUPA REI ROMA",
    "time": 0.001
  },
  {
    "algorithm": "diceCoefficient",
    "score": 0.8780487804878049,
    "input": "RATO ROEU ROUPA REI ROMA",
    "time": 0
  },
  {
    "algorithm": "hamming",
    "score": 0,
    "input": "RATO ROEU ROUPA REI ROMA",
    "time": 0
  },
  {
    "algorithm": "jaccard",
    "score": 0.7058823529411765,
    "input": "RATO ROEU ROUPA REI ROMA",
    "time": 0.001
  },
  {
    "algorithm": "jaro",
    "score": 0,
    "input": "RATO ROEU ROUPA REI ROMA",
    "time": 0
  },
  {
    "algorithm": "jaroWinkler",
    "score": 0,
    "input": "RATO ROEU ROUPA REI ROMA",
    "time": 0
  },
  {
    "algorithm": "levenshtein",
    "score": 0.7058823529411765,
    "input": "RATO ROEU ROUPA REI ROMA",
    "time": 0
  },
  {
    "algorithm": "needlemanWunsch",
    "score": 0.8382352941176471,
    "input": "RATO ROEU ROUPA REI ROMA",
    "time": 0.001
  },
  {
    "algorithm": "nGram",
    "score": 0.7058823529411765,
    "input": "RATO ROEU ROUPA REI ROMA",
    "time": 0
  },
  {
    "algorithm": "overlap",
    "score": 1,
    "input": "RATO ROEU ROUPA REI ROMA",
    "time": 0,
    "memory": 28300736
  },
  {
    "algorithm": "smithWaterman",
    "score": 1,
    "input": "RATO ROEU ROUPA REI ROMA",
    "time": 0.001
  },
  {
    "algorithm": "smithWatermanGotoh",
    "score": 0.6666666666666666,
    "input": "RATO ROEU ROUPA REI ROMA",
    "time": 0,
    "memory": 28300736
  },
  {
    "algorithm": "tversky",
    "score": 0.7931034482758621,
    "input": "RATO ROEU ROUPA REI ROMA",
    "time": 0
  },
  {
    "algorithm": "damerauDist",
    "score": 10,
    "input": "RATO ROEU ROUPA REI ROMA",
    "time": 0.001
  }
]
```