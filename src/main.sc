require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём
        
    state: hello
        intent!: /привет
        a: Привет привет
        

    state: weather
        q!: [*~погода*/*~дождь*/*~снег*/*~град*]
        a: Сегодня отличная погода!
        
    state: currency
        q!: [*~валюта*/*~курс*]
        a: Курс валюты безбашенный

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

        