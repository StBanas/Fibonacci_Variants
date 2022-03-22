### Create function that calculates Fibonacci sequence for given N:
      # Fib(0) == 0
      # Fib(1) == 1
      # Fib(N) == Fib(N-1) + Fib(N-2)

# **************

def fib(n):
    if n == 0:
        return 0
    elif n == 1:
        return 1
    else:
        return fib(n - 1) + fib(n - 2)

print(fib(24))

# **************

def fib_2(n):
    numbers = [0,1]
    for i in range(2, n+1):
        next = numbers[-1] + numbers[-2]
        numbers.append(next)
    print('All numbers: ', numbers)
    return numbers[-1]

print(fib_2(24))

# **************

def fib(n):
    actual, previous = 0, 1
    for i in range(n):
        actual, previous = actual + previous, actual
    return actual, previous

print(fib(24))

# **************












