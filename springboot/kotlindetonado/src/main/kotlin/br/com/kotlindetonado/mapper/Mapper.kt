package br.com.kotlindetonado.mapper

interface Mapper<TInput, TOutput> {
    fun toOutput(input: TInput):TOutput
    fun toInput(output: TOutput):TInput
}
