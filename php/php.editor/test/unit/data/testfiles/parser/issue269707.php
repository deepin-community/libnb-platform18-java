<?php

class Foo {

    public function sayHello() {
        echo "Hello, {$person->getName()}.";
    }

    public function newAnonClass() {

        $anon = new class() {

            public function something() {
                return 'something';
            }

        };
    }

}
