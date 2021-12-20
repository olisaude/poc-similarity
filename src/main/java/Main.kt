import com.github.vickumar1981.stringdistance.util.StringDistance

fun main (){


    // !!!!!Scores between two strings!!!!
    // ------testando o metodo "damerau"

    val init1 = System.currentTimeMillis()
    val x =  StringDistance.damerau("Emanuelle de Araújo Alves", "Emanuelle de A Alves")
    println("deu tanto: $x no tempo de : ${System.currentTimeMillis() - init1}")
    //deu tanto: 0.8 no tempo de : 157

    val init2 = System.currentTimeMillis()
    val y =  StringDistance.damerau("Emanuelle de Araújo Alves", "Emanuelle Alves")
    println("deu tanto: $y no tempo de : ${System.currentTimeMillis() - init2}")
    //deu tanto: 0.6 no tempo de : 158

    val init3 = System.currentTimeMillis()
    val z =  StringDistance.damerau("Emanuelle de Araújo Alves", "Emanuella dos Santos A")
    println("deu tanto: $z no tempo de : ${System.currentTimeMillis() - init3}")
    //deu tanto: 0.52 no tempo de : 159

    val init4 = System.currentTimeMillis()
    val b =  StringDistance.damerau("Emanuelle de Araújo Alves", "Emanuelle de Araújo Alves")
    println("deu tanto: $b no tempo de : ${System.currentTimeMillis() - init4}")
    //deu tanto: 1.0 no tempo de : 159

    val init9 = System.currentTimeMillis()
    val a =  StringDistance.damerau("Emanuelle de Araújo Alves", "Enzo dos Santos A")
    println("deu tanto: $a no tempo de : ${System.currentTimeMillis() - init9}")
    //

    val init5 = System.currentTimeMillis()
    val frase =  StringDistance.damerau("O rato roeu a roupa do rei de roma", "O rato roeu")
    println("deu tanto: $frase no tempo de : ${System.currentTimeMillis() - init5}")
    //deu tanto: 0.3235294117647059 no tempo de : 159

    val init6 = System.currentTimeMillis()
    val frase2 =  StringDistance.damerau("O rato roeu a roupa do rei de roma", "O rato roeu do rei")
    println("deu tanto: $frase2 no tempo de : ${System.currentTimeMillis() - init6}")
    //deu tanto: 0.5294117647058824 no tempo de : 160

    val init7 = System.currentTimeMillis()
    val frase3 =  StringDistance.damerau("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça do rato de roma")
    println("deu tanto: $frase3 no tempo de : ${System.currentTimeMillis() - init7}")
    //deu tanto: 0.6486486486486487 no tempo de : 160

    val init8 = System.currentTimeMillis()
    val frase4 =  StringDistance.damerau("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça da barata da italia")
    println("deu tanto: $frase4 no tempo de : ${System.currentTimeMillis() - init8}")
    //deu tanto: 0.4634146341463415 no tempo de : 160



    // --------testando o metodo cosSimilarity ------


    // val x =  StringDistance.cosine("Emanuelle de Araújo Alves", "Emanuelle de A Alves")
    // println("deu tanto: $x no tempo de : ${System.currentTimeMillis() - init1}")
    // //deu tanto: 0.9518773816153239 no tempo de : 258
    //
    // val y =  StringDistance.cosine("Emanuelle de Araújo Alves", "Emanuelle Alves")
    // println("deu tanto: $y no tempo de : ${System.currentTimeMillis() - init2}")
    // //deu tanto: deu tanto: 0.89879179714723 no tempo de : 260
    //
    // val z =  StringDistance.cosine("Emanuelle de Araújo Alves", "Emanuella dos Santos A")
    // println("deu tanto: $z no tempo de : ${System.currentTimeMillis() - init3}")
    // //deu tanto: 0.7842222212887001 no tempo de : 260
    //
    // val a =  StringDistance.cosine("Emanuelle de Araújo Alves", "Enzo dos Santos A")
    // println("deu tanto: $a no tempo de : ${System.currentTimeMillis() - init9}")
    // //deu tanto: 0.5260509098446915 no tempo de : 231
    //
    // val b =  StringDistance.cosine("Emanuelle de Araújo Alves", "Emanuelle de Araújo Alves")
    // println("deu tanto: $b no tempo de : ${System.currentTimeMillis() - init4}")
    // //deu tanto: 1.0 no tempo de : 266
    //
    // val frase =  StringDistance.cosine("O rato roeu a roupa do rei de roma", "O rato roeu")
    // println("deu tanto: $frase no tempo de : ${System.currentTimeMillis() - init5}")
    // //deu tanto: 0.9245951335534446 no tempo de : 266
    //
    // val frase2 =  StringDistance.cosine("O rato roeu a roupa do rei de roma", "O rato roeu do rei")
    // println("deu tanto: $frase2 no tempo de : ${System.currentTimeMillis() - init6}")
    // //deu tanto: 0.9660040763879241 no tempo de : 267
    //
    // val frase3 =  StringDistance.cosine("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça do rato de roma")
    // println("deu tanto: $frase3 no tempo de : ${System.currentTimeMillis() - init7}")
    // //deu tanto: 0.8957844443535974 no tempo de : 268
    //
    // val frase4 =  StringDistance.cosine("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça da barata da italia")
    // println("deu tanto: $frase4 no tempo de : ${System.currentTimeMillis() - init8}")
    // //deu tanto: 0.7254762501100116 no tempo de : 268




    // --------testando o metodo diceCoefficient ------


    // val x =  StringDistance.diceCoefficient("Emanuelle de Araújo Alves", "Emanuelle de A Alves")
    // println("deu tanto: $x no tempo de : ${System.currentTimeMillis() - init1}")
    // //deu tanto: 0.8205128205128205 no tempo de : 231
    //
    // val y =  StringDistance.diceCoefficient("Emanuelle de Araújo Alves", "Emanuelle Alves")
    // println("deu tanto: $y no tempo de : ${System.currentTimeMillis() - init2}")
    // //deu tanto: deu tanto: 0.7777777777777778 no tempo de : 232
    //
    // val z =  StringDistance.diceCoefficient("Emanuelle de Araújo Alves", "Emanuella dos Santos A")
    // println("deu tanto: $z no tempo de : ${System.currentTimeMillis() - init3}")
    // //deu tanto: 0.45 no tempo de : 232
    //
    // val a =  StringDistance.diceCoefficient("Emanuelle de Araújo Alves", "Enzo dos Santos A")
    // println("deu tanto: $a no tempo de : ${System.currentTimeMillis() - init9}")
    // //deu tanto: 0.2222222222222222 no tempo de : 233
    //
    // val b =  StringDistance.diceCoefficient("Emanuelle de Araújo Alves", "Emanuelle de Araújo Alves")
    // println("deu tanto: $b no tempo de : ${System.currentTimeMillis() - init4}")
    // //deu tanto: 1.0 no tempo de : 234
    //
    // val frase =  StringDistance.diceCoefficient("O rato roeu a roupa do rei de roma", "O rato roeu")
    // println("deu tanto: $frase no tempo de : ${System.currentTimeMillis() - init5}")
    // //deu tanto: 0.5454545454545454 no tempo de : 234
    //
    // val frase2 =  StringDistance.diceCoefficient("O rato roeu a roupa do rei de roma", "O rato roeu do rei")
    // println("deu tanto: $frase2 no tempo de : ${System.currentTimeMillis() - init6}")
    // //deu tanto: 0.7368421052631579 no tempo de : 235
    //
    // val frase3 =  StringDistance.diceCoefficient("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça do rato de roma")
    // println("deu tanto: $frase3 no tempo de : ${System.currentTimeMillis() - init7}")
    // //deu tanto: 0.6153846153846154 no tempo de : 235
    //
    // val frase4 =  StringDistance.diceCoefficient("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça da barata da italia")
    // println("deu tanto: $frase4 no tempo de : ${System.currentTimeMillis() - init8}")
    // //deu tanto: 0.3018867924528302 no tempo de : 236




    // --------testando o metodo hamming ------


    // val x =  StringDistance.hamming("Emanuelle de Araújo Alves", "Emanuelle de A Alves")
    // println("deu tanto: $x no tempo de : ${System.currentTimeMillis() - init1}")
    // //deu tanto: 0.0 no tempo de : 61
    //
    // val y =  StringDistance.hamming("Emanuelle de Araújo Alves", "Emanuelle Alves")
    // println("deu tanto: $y no tempo de : ${System.currentTimeMillis() - init2}")
    // //deu tanto: 0.0 no tempo de : 61
    //
    // val z =  StringDistance.hamming("Emanuelle de Araújo Alves", "Emanuella dos Santos A")
    // println("deu tanto: $z no tempo de : ${System.currentTimeMillis() - init3}")
    // //deu tanto: 0.0 no tempo de : 61
    //
    // val a =  StringDistance.hamming("Emanuelle de Araújo Alves", "Enzo dos Santos A")
    // println("deu tanto: $a no tempo de : ${System.currentTimeMillis() - init9}")
    // //deu tanto: 0.0 no tempo de : 61
    //
    // val b =  StringDistance.hamming("Emanuelle de Araújo Alves", "Emanuelle de Araújo Alves")
    // println("deu tanto: $b no tempo de : ${System.currentTimeMillis() - init4}")
    // //deu tanto: 1.0 no tempo de : 170
    //
    // val frase =  StringDistance.hamming("O rato roeu a roupa do rei de roma", "O rato roeu")
    // println("deu tanto: $frase no tempo de : ${System.currentTimeMillis() - init5}")
    // //deu tanto: deu tanto: 0.0 no tempo de : 170
    //
    // val frase2 =  StringDistance.hamming("O rato roeu a roupa do rei de roma", "O rato roeu do rei")
    // println("deu tanto: $frase2 no tempo de : ${System.currentTimeMillis() - init6}")
    // //deu tanto: 0.0 no tempo de : 170
    //
    // val frase3 =  StringDistance.hamming("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça do rato de roma")
    // println("deu tanto: $frase3 no tempo de : ${System.currentTimeMillis() - init7}")
    // //deu tanto: 0.0 no tempo de : 170
    //
    // val frase4 =  StringDistance.hamming("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça da barata da italia")
    // println("deu tanto: $frase4 no tempo de : ${System.currentTimeMillis() - init8}")
    // //deu tanto: 0.0 no tempo de : 170




    // --------testando o metodo jaccard ------


    // val x =  StringDistance.jaccard("Emanuelle de Araújo Alves", "Emanuelle de A Alves")
    // println("deu tanto: $x no tempo de : ${System.currentTimeMillis() - init1}")
    // //deu tanto: 0.8 no tempo de : 221
    //
    // val y =  StringDistance.jaccard("Emanuelle de Araújo Alves", "Emanuelle Alves")
    // println("deu tanto: $y no tempo de : ${System.currentTimeMillis() - init2}")
    // //deu tanto: 0.6 no tempo de : 222
    //
    // val z =  StringDistance.jaccard("Emanuelle de Araújo Alves", "Emanuella dos Santos A")
    // println("deu tanto: $z no tempo de : ${System.currentTimeMillis() - init3}")
    // //deu tanto: 0.5161290322580645 no tempo de : 223
    //
    // val a =  StringDistance.jaccard("Emanuelle de Araújo Alves", "Enzo dos Santos A")
    // println("deu tanto: $a no tempo de : ${System.currentTimeMillis() - init9}")
    // //deu tanto: 0.3125 no tempo de : 224
    //
    // val b =  StringDistance.jaccard("Emanuelle de Araújo Alves", "Emanuelle de Araújo Alves")
    // println("deu tanto: $b no tempo de : ${System.currentTimeMillis() - init4}")
    // //deu tanto: 1.0 no tempo de : 225
    //
    // val frase =  StringDistance.jaccard("O rato roeu a roupa do rei de roma", "O rato roeu")
    // println("deu tanto: $frase no tempo de : ${System.currentTimeMillis() - init5}")
    // //deu tanto: 0.3235294117647059 no tempo de : 225
    //
    // val frase2 =  StringDistance.jaccard("O rato roeu a roupa do rei de roma", "O rato roeu do rei")
    // println("deu tanto: $frase2 no tempo de : ${System.currentTimeMillis() - init6}")
    // //deu tanto: 0.5294117647058824 no tempo de : 226
    //
    // val frase3 =  StringDistance.jaccard("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça do rato de roma")
    // println("deu tanto: $frase3 no tempo de : ${System.currentTimeMillis() - init7}")
    // //deu tanto: 0.5777777777777777 no tempo de : 227
    //
    // val frase4 =  StringDistance.jaccard("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça da barata da italia")
    // println("deu tanto: $frase4 no tempo de : ${System.currentTimeMillis() - init8}")
    // //deu tanto: 0.41509433962264153 no tempo de : 228




    // --------testando o metodo jaro ------


    // val x =  StringDistance.jaro("Emanuelle de Araújo Alves", "Emanuelle de A Alves")
    // println("deu tanto: $x no tempo de : ${System.currentTimeMillis() - init1}")
    // //deu tanto: 0.9333333333333332 no tempo de : 175
    //
    // val y =  StringDistance.jaro("Emanuelle de Araújo Alves", "Emanuelle Alves")
    // println("deu tanto: $y no tempo de : ${System.currentTimeMillis() - init2}")
    // //deu tanto: 0.7570940170940171 no tempo de : 178
    //
    // val z =  StringDistance.jaro("Emanuelle de Araújo Alves", "Emanuella dos Santos A")
    // println("deu tanto: $z no tempo de : ${System.currentTimeMillis() - init3}")
    // //deu tanto: 0.0 no tempo de : 179
    //
    // val a =  StringDistance.jaro("Emanuelle de Araújo Alves", "Enzo dos Santos A")
    // println("deu tanto: $a no tempo de : ${System.currentTimeMillis() - init9}")
    // //deu tanto: 0.0 no tempo de : 180
    //
    // val b =  StringDistance.jaro("Emanuelle de Araújo Alves", "Emanuelle de Araújo Alves")
    // println("deu tanto: $b no tempo de : ${System.currentTimeMillis() - init4}")
    // //deu tanto: 1.0 no tempo de : 181
    //
    // val frase =  StringDistance.jaro("O rato roeu a roupa do rei de roma", "O rato roeu")
    // println("deu tanto: $frase no tempo de : ${System.currentTimeMillis() - init5}")
    // //deu tanto: 0.0 no tempo de : 181
    //
    // val frase2 =  StringDistance.jaro("O rato roeu a roupa do rei de roma", "O rato roeu do rei")
    // println("deu tanto: $frase2 no tempo de : ${System.currentTimeMillis() - init6}")
    // //deu tanto: 0.0 no tempo de : 181
    //
    // val frase3 =  StringDistance.jaro("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça do rato de roma")
    // println("deu tanto: $frase3 no tempo de : ${System.currentTimeMillis() - init7}")
    // //deu tanto: 0.815689929280193 no tempo de : 182
    //
    // val frase4 =  StringDistance.jaro("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça da barata da italia")
    // println("deu tanto: $frase4 no tempo de : ${System.currentTimeMillis() - init8}")
    // //deu tanto: 0.0 no tempo de : 183




    // --------testando o metodo jaroWinkler------

    //
    // val x =  StringDistance.jaroWinkler("Emanuelle de Araújo Alves", "Emanuelle de A Alves")
    // println("deu tanto: $x no tempo de : ${System.currentTimeMillis() - init1}")
    // //deu tanto: 0.96 no tempo de : 210
    //
    // val y =  StringDistance.jaroWinkler("Emanuelle de Araújo Alves", "Emanuelle Alves")
    // println("deu tanto: $y no tempo de : ${System.currentTimeMillis() - init2}")
    // //deu tanto: 0.8542564102564103 no tempo de : 213
    //
    // val z =  StringDistance.jaroWinkler("Emanuelle de Araújo Alves", "Emanuella dos Santos A")
    // println("deu tanto: $z no tempo de : ${System.currentTimeMillis() - init3}")
    // //deu tanto: 0.4 no tempo de : 214
    //
    // val a =  StringDistance.jaroWinkler("Emanuelle de Araújo Alves", "Enzo dos Santos A")
    // println("deu tanto: $a no tempo de : ${System.currentTimeMillis() - init9}")
    // //deu tanto: 0.1 no tempo de : 215
    //
    // val b =  StringDistance.jaroWinkler("Emanuelle de Araújo Alves", "Emanuelle de Araújo Alves")
    // println("deu tanto: $b no tempo de : ${System.currentTimeMillis() - init4}")
    // //deu tanto: 1.0 no tempo de : 216
    //
    // val frase =  StringDistance.jaroWinkler("O rato roeu a roupa do rei de roma", "O rato roeu")
    // println("deu tanto: $frase no tempo de : ${System.currentTimeMillis() - init5}")
    // //deu tanto: 0.4 no tempo de : 216
    //
    // val frase2 =  StringDistance.jaroWinkler("O rato roeu a roupa do rei de roma", "O rato roeu do rei")
    // println("deu tanto: $frase2 no tempo de : ${System.currentTimeMillis() - init6}")
    // //deu tanto: 0.4 no tempo de : 217
    //
    // val frase3 =  StringDistance.jaroWinkler("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça do rato de roma")
    // println("deu tanto: $frase3 no tempo de : ${System.currentTimeMillis() - init7}")
    // //deu tanto: 0.815689929280193 no tempo de : 217
    //
    // val frase4 =  StringDistance.jaroWinkler("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça da barata da italia")
    // println("deu tanto: $frase4 no tempo de : ${System.currentTimeMillis() - init8}")
    // //deu tanto: 0.0 no tempo de : 218




    // --------testando o metodo levenshtein ------


    // val x =  StringDistance.levenshtein("Emanuelle de Araújo Alves", "Emanuelle de A Alves")
    // println("deu tanto: $x no tempo de : ${System.currentTimeMillis() - init1}")
    // //deu tanto: 0.8 no tempo de : 203
    //
    // val y =  StringDistance.levenshtein("Emanuelle de Araújo Alves", "Emanuelle Alves")
    // println("deu tanto: $y no tempo de : ${System.currentTimeMillis() - init2}")
    // //deu tanto: 0.6 no tempo de : 205
    //
    // val z =  StringDistance.levenshtein("Emanuelle de Araújo Alves", "Emanuella dos Santos A")
    // println("deu tanto: $z no tempo de : ${System.currentTimeMillis() - init3}")
    // //deu tanto: 0.52 no tempo de : 207
    //
    // val a =  StringDistance.levenshtein("Emanuelle de Araújo Alves", "Enzo dos Santos A")
    // println("deu tanto: $a no tempo de : ${System.currentTimeMillis() - init9}")
    // //deu tanto: 0.28 no tempo de : 208
    //
    // val b =  StringDistance.levenshtein("Emanuelle de Araújo Alves", "Emanuelle de Araújo Alves")
    // println("deu tanto: $b no tempo de : ${System.currentTimeMillis() - init4}")
    // //deu tanto: 1.0 no tempo de : 209
    //
    // val frase =  StringDistance.levenshtein("O rato roeu a roupa do rei de roma", "O rato roeu")
    // println("deu tanto: $frase no tempo de : ${System.currentTimeMillis() - init5}")
    // //deu tanto: 0.3235294117647059 no tempo de : 210
    //
    // val frase2 =  StringDistance.levenshtein("O rato roeu a roupa do rei de roma", "O rato roeu do rei")
    // println("deu tanto: $frase2 no tempo de : ${System.currentTimeMillis() - init6}")
    // //deu tanto: 0.5294117647058824 no tempo de : 211
    //
    // val frase3 =  StringDistance.levenshtein("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça do rato de roma")
    // println("deu tanto: $frase3 no tempo de : ${System.currentTimeMillis() - init7}")
    // //deu tanto: 0.6486486486486487 no tempo de : 213
    //
    // val frase4 =  StringDistance.levenshtein("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça da barata da italia")
    // println("deu tanto: $frase4 no tempo de : ${System.currentTimeMillis() - init8}")
    // //deu tanto: 0.4634146341463415 no tempo de : 214




    // --------testando o metodo needlemanWunsch ------


    // val x =  StringDistance.needlemanWunsch("Emanuelle de Araújo Alves", "Emanuelle de A Alves")
    // println("deu tanto: $x no tempo de : ${System.currentTimeMillis() - init1}")
    // //deu tanto: 0.88 no tempo de : 206
    //
    // val y =  StringDistance.needlemanWunsch("Emanuelle de Araújo Alves", "Emanuelle Alves")
    // println("deu tanto: $y no tempo de : ${System.currentTimeMillis() - init2}")
    // //deu tanto: 0.78 no tempo de : 208
    //
    // val z =  StringDistance.needlemanWunsch("Emanuelle de Araújo Alves", "Emanuella dos Santos A")
    // println("deu tanto: $z no tempo de : ${System.currentTimeMillis() - init3}")
    // //deu tanto: 0.8 no tempo de : 208
    //
    // val a =  StringDistance.needlemanWunsch("Emanuelle de Araújo Alves", "Enzo dos Santos A")
    // println("deu tanto: $a no tempo de : ${System.currentTimeMillis() - init9}")
    // //deu tanto: 0.68 no tempo de : 209
    //
    // val b =  StringDistance.needlemanWunsch("Emanuelle de Araújo Alves", "Emanuelle de Araújo Alves")
    // println("deu tanto: $b no tempo de : ${System.currentTimeMillis() - init4}")
    // //deu tanto: 1.0 no tempo de : 209
    //
    // val frase =  StringDistance.needlemanWunsch("O rato roeu a roupa do rei de roma", "O rato roeu")
    // println("deu tanto: $frase no tempo de : ${System.currentTimeMillis() - init5}")
    // //deu tanto: 0.6617647058823529 no tempo de : 209
    //
    // val frase2 =  StringDistance.needlemanWunsch("O rato roeu a roupa do rei de roma", "O rato roeu do rei")
    // println("deu tanto: $frase2 no tempo de : ${System.currentTimeMillis() - init6}")
    // //deu tanto: 0.7647058823529411 no tempo de : 210
    //
    // val frase3 =  StringDistance.needlemanWunsch("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça do rato de roma")
    // println("deu tanto: $frase3 no tempo de : ${System.currentTimeMillis() - init7}")
    // //deu tanto: 0.8108108108108109 no tempo de : 210
    //
    // val frase4 =  StringDistance.needlemanWunsch("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça da barata da italia")
    // println("deu tanto: $frase4 no tempo de : ${System.currentTimeMillis() - init8}")
    // //deu tanto: 0.7195121951219512 no tempo de : 210




    // --------testando o metodo nGram ------


    // val x =  StringDistance.nGram("Emanuelle de Araújo Alves", "Emanuelle de A Alves")
    // println("deu tanto: $x no tempo de : ${System.currentTimeMillis() - init1}")
    // //deu tanto: 0.8 no tempo de : 238
    //
    // val y =  StringDistance.nGram("Emanuelle de Araújo Alves", "Emanuelle Alves")
    // println("deu tanto: $y no tempo de : ${System.currentTimeMillis() - init2}")
    // //deu tanto: 0.6 no tempo de : 240
    //
    // val z =  StringDistance.nGram("Emanuelle de Araújo Alves", "Emanuella dos Santos A")
    // println("deu tanto: $z no tempo de : ${System.currentTimeMillis() - init3}")
    // //deu tanto: 0.64 no tempo de : 241
    //
    // val a =  StringDistance.nGram("Emanuelle de Araújo Alves", "Enzo dos Santos A")
    // println("deu tanto: $a no tempo de : ${System.currentTimeMillis() - init9}")
    // //deu tanto: 0.4 no tempo de : 242
    //
    // val b =  StringDistance.nGram("Emanuelle de Araújo Alves", "Emanuelle de Araújo Alves")
    // println("deu tanto: $b no tempo de : ${System.currentTimeMillis() - init4}")
    // //deu tanto: 1.0 no tempo de : 242
    //
    // val frase =  StringDistance.nGram("O rato roeu a roupa do rei de roma", "O rato roeu")
    // println("deu tanto: $frase no tempo de : ${System.currentTimeMillis() - init5}")
    // //deu tanto: 0.3235294117647059 no tempo de : 244
    //
    // val frase2 =  StringDistance.nGram("O rato roeu a roupa do rei de roma", "O rato roeu do rei")
    // println("deu tanto: $frase2 no tempo de : ${System.currentTimeMillis() - init6}")
    // //deu tanto: 0.5294117647058824 no tempo de : 245
    //
    // val frase3 =  StringDistance.nGram("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça do rato de roma")
    // println("deu tanto: $frase3 no tempo de : ${System.currentTimeMillis() - init7}")
    // //deu tanto: 0.7027027027027027 no tempo de : 247
    //
    // val frase4 =  StringDistance.nGram("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça da barata da italia")
    // println("deu tanto: $frase4 no tempo de : ${System.currentTimeMillis() - init8}")
    // //deu tanto: 0.5365853658536586 no tempo de : 249




    // --------testando o metodo overlap------

    //
    // val x =  StringDistance.overlap("Emanuelle de Araújo Alves", "Emanuelle de A Alves")
    // println("deu tanto: $x no tempo de : ${System.currentTimeMillis() - init1}")
    // //deu tanto: 1.0 no tempo de : 215
    //
    // val y =  StringDistance.overlap("Emanuelle de Araújo Alves", "Emanuelle Alves")
    // println("deu tanto: $y no tempo de : ${System.currentTimeMillis() - init2}")
    // //deu tanto: 1.0 no tempo de : 216
    //
    // val z =  StringDistance.overlap("Emanuelle de Araújo Alves", "Emanuella dos Santos A")
    // println("deu tanto: $z no tempo de : ${System.currentTimeMillis() - init3}")
    // //deu tanto: 0.7272727272727273 no tempo de : 217
    //
    // val a =  StringDistance.overlap("Emanuelle de Araújo Alves", "Enzo dos Santos A")
    // println("deu tanto: $a no tempo de : ${System.currentTimeMillis() - init9}")
    // //deu tanto: 0.5882352941176471 no tempo de : 218
    //
    // val b =  StringDistance.overlap("Emanuelle de Araújo Alves", "Emanuelle de Araújo Alves")
    // println("deu tanto: $b no tempo de : ${System.currentTimeMillis() - init4}")
    // //deu tanto: 1.0 no tempo de : 219
    //
    // val frase =  StringDistance.overlap("O rato roeu a roupa do rei de roma", "O rato roeu")
    // println("deu tanto: $frase no tempo de : ${System.currentTimeMillis() - init5}")
    // //deu tanto: 1.0 no tempo de : 220
    //
    // val frase2 =  StringDistance.overlap("O rato roeu a roupa do rei de roma", "O rato roeu do rei")
    // println("deu tanto: $frase2 no tempo de : ${System.currentTimeMillis() - init6}")
    // //deu tanto: 1.0 no tempo de : 221
    //
    // val frase3 =  StringDistance.overlap("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça do rato de roma")
    // println("deu tanto: $frase3 no tempo de : ${System.currentTimeMillis() - init7}")
    // //deu tanto: 0.7647058823529411 no tempo de : 222
    //
    // val frase4 =  StringDistance.overlap("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça da barata da italia")
    // println("deu tanto: $frase4 no tempo de : ${System.currentTimeMillis() - init8}")
    // //deu tanto: 0.6470588235294118 no tempo de : 224




    // --------testando o metodo smithWaterman------


    // val x =  StringDistance.smithWaterman("Emanuelle de Araújo Alves", "Emanuelle de A Alves")
    // println("deu tanto: $x no tempo de : ${System.currentTimeMillis() - init1}")
    // //deu tanto: 1.0 no tempo de : 222
    //
    // val y =  StringDistance.smithWaterman("Emanuelle de Araújo Alves", "Emanuelle Alves")
    // println("deu tanto: $y no tempo de : ${System.currentTimeMillis() - init2}")
    // //deu tanto: 1.0 no tempo de : 224
    //
    // val z =  StringDistance.smithWaterman("Emanuelle de Araújo Alves", "Emanuella dos Santos A")
    // println("deu tanto: $z no tempo de : ${System.currentTimeMillis() - init3}")
    // //deu tanto: 0.6818181818181818 no tempo de : 226
    //
    // val a =  StringDistance.smithWaterman("Emanuelle de Araújo Alves", "Enzo dos Santos A")
    // println("deu tanto: $a no tempo de : ${System.currentTimeMillis() - init9}")
    // //deu tanto: 0.47058823529411764 no tempo de : 227
    //
    // val b =  StringDistance.smithWaterman("Emanuelle de Araújo Alves", "Emanuelle de Araújo Alves")
    // println("deu tanto: $b no tempo de : ${System.currentTimeMillis() - init4}")
    // //deu tanto: 1.0 no tempo de : 228
    //
    // val frase =  StringDistance.smithWaterman("O rato roeu a roupa do rei de roma", "O rato roeu")
    // println("deu tanto: $frase no tempo de : ${System.currentTimeMillis() - init5}")
    // //deu tanto: 1.0 no tempo de : 229
    //
    // val frase2 =  StringDistance.smithWaterman("O rato roeu a roupa do rei de roma", "O rato roeu do rei")
    // println("deu tanto: $frase2 no tempo de : ${System.currentTimeMillis() - init6}")
    // //deu tanto: 1.0 no tempo de : 230
    //
    // val frase3 =  StringDistance.smithWaterman("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça do rato de roma")
    // println("deu tanto: $frase3 no tempo de : ${System.currentTimeMillis() - init7}")
    // //deu tanto: 0.7058823529411765 no tempo de : 232
    //
    // val frase4 =  StringDistance.smithWaterman("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça da barata da italia")
    // println("deu tanto: $frase4 no tempo de : ${System.currentTimeMillis() - init8}")
    // //deu tanto: 0.5588235294117647 no tempo de : 234




    // --------testando o metodo smithWatermanGotoh-----


    // val x =  StringDistance.smithWatermanGotoh("Emanuelle de Araújo Alves", "Emanuelle de A Alves")
    // println("deu tanto: $x no tempo de : ${System.currentTimeMillis() - init1}")
    // //deu tanto: 0.7 no tempo de : 175
    //
    // val y =  StringDistance.smithWatermanGotoh("Emanuelle de Araújo Alves", "Emanuelle Alves")
    // println("deu tanto: $y no tempo de : ${System.currentTimeMillis() - init2}")
    // //deu tanto: 0.6 no tempo de : 175
    //
    // val z =  StringDistance.smithWatermanGotoh("Emanuelle de Araújo Alves", "Emanuella dos Santos A")
    // println("deu tanto: $z no tempo de : ${System.currentTimeMillis() - init3}")
    // //deu tanto: 0.36363636363636365 no tempo de : 176
    //
    // val a =  StringDistance.smithWatermanGotoh("Emanuelle de Araújo Alves", "Enzo dos Santos A")
    // println("deu tanto: $a no tempo de : ${System.currentTimeMillis() - init9}")
    // //deu tanto: 0.11764705882352941 no tempo de : 176
    //
    // val b =  StringDistance.smithWatermanGotoh("Emanuelle de Araújo Alves", "Emanuelle de Araújo Alves")
    // println("deu tanto: $b no tempo de : ${System.currentTimeMillis() - init4}")
    // //deu tanto: 0.96 no tempo de : 176
    //
    // val frase =  StringDistance.smithWatermanGotoh("O rato roeu a roupa do rei de roma", "O rato roeu")
    // println("deu tanto: $frase no tempo de : ${System.currentTimeMillis() - init5}")
    // //deu tanto: 0.9090909090909091 no tempo de : 176
    //
    // val frase2 =  StringDistance.smithWatermanGotoh("O rato roeu a roupa do rei de roma", "O rato roeu do rei")
    // println("deu tanto: $frase2 no tempo de : ${System.currentTimeMillis() - init6}")
    // //deu tanto: 0.6111111111111112 no tempo de : 177
    //
    // val frase3 =  StringDistance.smithWatermanGotoh("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça do rato de roma")
    // println("deu tanto: $frase3 no tempo de : ${System.currentTimeMillis() - init7}")
    // //deu tanto: 0.23529411764705882 no tempo de : 177
    //
    // val frase4 =  StringDistance.smithWatermanGotoh("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça da barata da italia")
    // println("deu tanto: $frase4 no tempo de : ${System.currentTimeMillis() - init8}")
    // //deu tanto: 0.14705882352941177 no tempo de : 177




    // --------testando o metodo tversky-----


    // val x =  StringDistance.tversky("Emanuelle de Araújo Alves", "Emanuelle de A Alves")
    // println("deu tanto: $x no tempo de : ${System.currentTimeMillis() - init1}")
    // //deu tanto: 0.72 no tempo de : 210
    //
    // val y =  StringDistance.tversky("Emanuelle de Araújo Alves", "Emanuelle Alves")
    // println("deu tanto: $y no tempo de : ${System.currentTimeMillis() - init2}")
    // //deu tanto: 0.6363636363636364 no tempo de : 211
    //
    // val z =  StringDistance.tversky("Emanuelle de Araújo Alves", "Emanuella dos Santos A")
    // println("deu tanto: $z no tempo de : ${System.currentTimeMillis() - init3}")
    // //deu tanto: 0.2647058823529412 no tempo de : 212
    //
    // val a =  StringDistance.tversky("Emanuelle de Araújo Alves", "Enzo dos Santos A")
    // println("deu tanto: $a no tempo de : ${System.currentTimeMillis() - init9}")
    // //deu tanto: 0.11428571428571428 no tempo de : 213
    //
    // val b =  StringDistance.tversky("Emanuelle de Araújo Alves", "Emanuelle de Araújo Alves")
    // println("deu tanto: $b no tempo de : ${System.currentTimeMillis() - init4}")
    // //deu tanto: 1.0 no tempo de : 214
    //
    // val frase =  StringDistance.tversky("O rato roeu a roupa do rei de roma", "O rato roeu")
    // println("deu tanto: $frase no tempo de : ${System.currentTimeMillis() - init5}")
    // //deu tanto: 0.37037037037037035 no tempo de : 215
    //
    // val frase2 =  StringDistance.tversky("O rato roeu a roupa do rei de roma", "O rato roeu do rei")
    // println("deu tanto: $frase2 no tempo de : ${System.currentTimeMillis() - init6}")
    // //deu tanto: 0.6071428571428571 no tempo de : 216
    //
    // val frase3 =  StringDistance.tversky("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça do rato de roma")
    // println("deu tanto: $frase3 no tempo de : ${System.currentTimeMillis() - init7}")
    // //deu tanto: 0.4878048780487805 no tempo de : 217
    //
    // val frase4 =  StringDistance.tversky("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça da barata da italia")
    // println("deu tanto: $frase4 no tempo de : ${System.currentTimeMillis() - init8}")
    // //deu tanto: 0.1724137931034483 no tempo de : 219



    // !!!!Distances between two strings!!!!
    // --------testando o metodo damerauDist-----

    //
    // val x =  StringDistance.damerauDist("Emanuelle de Araújo Alves", "Emanuelle de A Alves")
    // println("deu tanto: $x no tempo de : ${System.currentTimeMillis() - init1}")
    // //deu tanto: 0.72 no tempo de : 210
    //
    // val y =  StringDistance.damerauDist("Emanuelle de Araújo Alves", "Emanuelle Alves")
    // println("deu tanto: $y no tempo de : ${System.currentTimeMillis() - init2}")
    // //deu tanto: 0.6363636363636364 no tempo de : 211
    //
    // val z =  StringDistance.damerauDist("Emanuelle de Araújo Alves", "Emanuella dos Santos A")
    // println("deu tanto: $z no tempo de : ${System.currentTimeMillis() - init3}")
    // //deu tanto: 0.2647058823529412 no tempo de : 212
    //
    // val a =  StringDistance.damerauDist("Emanuelle de Araújo Alves", "Enzo dos Santos A")
    // println("deu tanto: $a no tempo de : ${System.currentTimeMillis() - init9}")
    // //deu tanto: 0.11428571428571428 no tempo de : 213
    //
    // val b =  StringDistance.damerauDist("Emanuelle de Araújo Alves", "Emanuelle de Araújo Alves")
    // println("deu tanto: $b no tempo de : ${System.currentTimeMillis() - init4}")
    // //deu tanto: 1.0 no tempo de : 214
    //
    // val frase =  StringDistance.damerauDist("O rato roeu a roupa do rei de roma", "O rato roeu")
    // println("deu tanto: $frase no tempo de : ${System.currentTimeMillis() - init5}")
    // //deu tanto: 0.37037037037037035 no tempo de : 215
    //
    // val frase2 =  StringDistance.damerauDist("O rato roeu a roupa do rei de roma", "O rato roeu do rei")
    // println("deu tanto: $frase2 no tempo de : ${System.currentTimeMillis() - init6}")
    // //deu tanto: 0.6071428571428571 no tempo de : 216
    //
    // val frase3 =  StringDistance.damerauDist("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça do rato de roma")
    // println("deu tanto: $frase3 no tempo de : ${System.currentTimeMillis() - init7}")
    // //deu tanto: 0.4878048780487805 no tempo de : 217
    //
    // val frase4 =  StringDistance.damerauDist("O rato roeu a roupa do rei de roma", "A gata comeu a cabeça da barata da italia")
    // println("deu tanto: $frase4 no tempo de : ${System.currentTimeMillis() - init8}")
    // //deu tanto: 0.1724137931034483 no tempo de : 219

}