declare class Foo {
    foo(a: Foo.Types.Bar): Foo.Types.Baz
}

declare namespace Foo {
    export type Bar = String
    export class Baz {}
    export import Types = Foo;
}
