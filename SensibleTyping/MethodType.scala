def madMethod() = { throw new IllegalArgumentException() }

println(getClass().getDeclaredMethod("madMethod", null).
  getReturnType().getName())
