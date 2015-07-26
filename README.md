# Immutables Android Example
Small example of use [Immutables 2.0](http://immutables.github.io/) for Android and GSON.

With the follow `User` model:

```
@Gson.TypeAdapters
@Value.Immutable
public abstract class User {

    public abstract int id();

    public abstract String username();
}
```

We can use it as:

```
User user = ImmutableUser.builder().id(1).username("olidroide").build();
```

Serialize:
```
String jsonUser = new JsonFromUser().map(user);
```

Deserialize:
```
User user = new UserFromJson().map(jsonUser);
```

### More info

http://immutables.github.io/immutable.html

### Thanks to

* **[saulmm](https://gist.github.com/saulmm)** and **[gabrielemariotti](https://gist.github.com/gabrielemariotti)** *for build.gradle configuration*
 * http://saulmm.github.io/squeezing-gradle-builds/
 * https://gist.github.com/gabrielemariotti/ad6672902464ee2392d0


* **[frogermcs](https://gist.github.com/frogermcs)** *for over 65k limit tutorial*
 * http://frogermcs.github.io/MultiDex-solution-for-64k-limit-in-Dalvik/
