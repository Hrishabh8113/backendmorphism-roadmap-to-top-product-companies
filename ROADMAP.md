# SDE II / Senior Backend Engineer Roadmap

A structured roadmap for experienced software engineers preparing for
**SDE II / Software Engineer II / Senior Backend Software Engineer**
roles at top product companies.

The roadmap focuses on building strong fundamentals first, then
progressing toward backend engineering, distributed systems,
cloud-native development, AI application engineering, and finally
interview readiness.

------------------------------------------------------------------------

## 🎯 Target Role

### Primary Target

**SDE II / Software Engineer II / Senior Backend Software Engineer**

The goal is to become an engineer who can:

- Solve medium and hard algorithmic problems in Java.
- Write clean, maintainable and production-quality code.
- Understand Java internals and concurrency.
- Build production-grade backend APIs.
- Design reliable database-backed systems.
- Build asynchronous and event-driven workflows.
- Reason about distributed systems and failure modes.
- Design systems using LLD and HLD principles.
- Deploy and operate backend services on cloud infrastructure.
- Debug production issues using logs, metrics and traces.
- Build AI-enabled backend applications.
- Clearly explain technical decisions and trade-offs in interviews.

------------------------------------------------------------------------

## 🧭 Roadmap Philosophy

> **Depth beats breadth.**

The objective is not to learn as many technologies as possible.

The objective is to reach a point where a concept can be:

**Learned → Implemented → Tested → Debugged → Explained → Designed →
Defended**

A technology should not be considered complete merely because a tutorial
or course has been finished.

------------------------------------------------------------------------

## 🏆 Priority Model

| Priority | Meaning            | Competencies                                                                                                   |
|----------|--------------------|----------------------------------------------------------------------------------------------------------------|
| **P0**   | Interview Critical | Java, DSA, SQL/Databases, Backend, Spring Boot, Security, Messaging, Distributed Systems, LLD, HLD, Behavioral |
| **P1**   | Career Multiplier  | AWS, Docker, Kubernetes, Terraform, CI/CD, Observability, Production Engineering, AI/GenAI                     |
| **P2**   | Selective Breadth  | Advanced Kafka, Redis, OpenSearch/Elasticsearch, Python automation, cloud comparisons, advanced MLOps          |

------------------------------------------------------------------------

# 🗺️ Overall Learning Path

``` text
Phase 0  → Setup & Baseline
Phase 1  → Java + Computer Science Foundations
Phase 2  → DSA + Problem Solving
Phase 3  → SQL + Databases
Phase 4  → Spring Boot + Backend Engineering
Phase 5  → Security + APIs + Integrations
Phase 6  → Messaging + Microservices
Phase 7  → Distributed Systems
Phase 8  → LLD + HLD / System Design
Phase 9  → AWS Cloud
Phase 10 → Docker + Kubernetes + Terraform + CI/CD
Phase 11 → AI / GenAI Application Engineering
Phase 12 → Production Engineering + Observability
Phase 13 → SDE II Interview Preparation
```

------------------------------------------------------------------------

# ⏱️ Suggested 12-Month Timeline

| Phase                               | Duration    |
|-------------------------------------|-------------|
| Phase 0 — Setup & Baseline          | Week 0      |
| Phase 1 — Java + CS                 | Weeks 1–5   |
| Phase 2 — DSA                       | Weeks 1–12  |
| Phase 3 — SQL + Databases           | Weeks 6–8   |
| Phase 4 — Spring Boot + Backend     | Weeks 9–13  |
| Phase 5 — Security + Integrations   | Weeks 14–16 |
| Phase 6 — Messaging + Microservices | Weeks 17–20 |
| Phase 7 — Distributed Systems       | Weeks 21–24 |
| Phase 8 — LLD + HLD                 | Weeks 25–32 |
| Phase 9 — AWS                       | Weeks 33–36 |
| Phase 10 — Containers + IaC + CI/CD | Weeks 37–40 |
| Phase 11 — AI / GenAI               | Weeks 41–44 |
| Phase 12 — Production Engineering   | Weeks 45–46 |
| Phase 13 — Interview Sprint         | Weeks 47–52 |

**Important:** DSA runs continuously from the beginning rather than
being postponed until the end.

------------------------------------------------------------------------

# 📚 PHASE 0 — SETUP & BASELINE

**Duration:** Week 0

## Objective

Create a repeatable engineering and learning environment.

## Setup

- Git
- GitHub
- Java 21+
- Maven / Gradle
- IDE
- Docker
- JUnit 5
- Terminal
- Notes system
- Coding practice platform
- Issue tracker
- CI basics

## Git Topics

- Repository
- Working tree
- Staging area
- Commit
- Branch
- Merge
- Rebase
- Cherry-pick
- Revert
- Reset
- Reflog
- Conflict resolution
- Clean commit messages
- Pull requests
- Code review

## Build Tools

### Maven

- Lifecycle
- Dependencies
- Dependency scopes
- Plugins
- Profiles
- BOM
- Dependency tree
- Build/test/package workflow

### Gradle

Learn the basic concepts and understand how it differs from Maven.

## IDE / Debugging

- Breakpoints
- Watches
- Call stack
- Thread view
- Debugging exceptions
- Memory inspection
- Profiler basics
- Remote debugging concepts

## Terminal

- Navigation
- grep
- find
- sed
- awk
- curl
- jq
- ps
- top / htop
- netstat / ss
- lsof
- tail
- chmod
- Environment variables

## Baseline Assessment

Complete:

- One timed DSA session
- One Java fundamentals assessment
- One SQL assessment
- One basic system design attempt

Record weaknesses instead of trying to fix everything immediately.

## Exit Criteria

- [ ] Git repository is ready
- [ ] Java development environment works
- [ ] Maven/Gradle works
- [ ] Unit tests can run
- [ ] Can create and push commits
- [ ] Can debug a Java application
- [ ] Baseline weaknesses documented

------------------------------------------------------------------------

# ☕ PHASE 1 — JAVA + COMPUTER SCIENCE FOUNDATIONS

**Duration:** Weeks 1–5

**Objective:** Move from experienced Java development to interview-grade
Java knowledge.

## Java Language Fundamentals

### OOP

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction
- Composition over inheritance
- SOLID principles

### Classes and Interfaces

- Interface
- Abstract class
- Default methods
- Static interface methods
- Sealed classes
- Records
- Enums

### Object Design

- Immutability
- Defensive copying
- Value objects
- `final`
- Object lifecycle

### Object Contracts

- `equals()`
- `hashCode()`
- `toString()`
- Equality contract
- Effects on collections

## Generics

- Generic classes
- Generic methods
- Type parameters
- Upper bounds
- Lower bounds
- Wildcards
- PECS
- Type erasure

## Exception Handling

- Checked exceptions
- Unchecked exceptions
- Custom exceptions
- Exception translation
- Exception propagation
- try-with-resources

## Collections

### List

- ArrayList
- LinkedList

### Set

- HashSet
- TreeSet
- EnumSet

### Map

- HashMap
- TreeMap
- EnumMap

### Queue / Deque

- Queue
- Deque
- PriorityQueue

### Internals

- Hashing
- Buckets
- Collisions
- Load factor
- Resize
- Treeification
- Comparator
- Comparable

## Concurrent Java

- Thread
- Runnable
- Callable
- Future
- ExecutorService
- Thread pools
- `synchronized`
- `volatile`
- Lock
- ReentrantLock
- Atomic classes
- ConcurrentHashMap
- BlockingQueue
- CopyOnWriteArrayList
- Race conditions
- Deadlocks
- Livelocks
- Starvation
- Visibility
- Atomicity
- Happens-before

## Modern Java

- Records
- Sealed classes
- Pattern matching
- Switch expressions
- Text blocks
- Local variable type inference
- Virtual threads
- CompletableFuture
- `java.util.concurrent`
- Date/time API

## JVM

- JVM architecture
- Class loading
- Runtime data areas
- Heap
- Stack
- Metaspace
- JIT compilation
- Object allocation
- Garbage collection
- Heap dumps
- Thread dumps
- GC logs
- jcmd
- jstack
- jmap
- Java Flight Recorder

## Operating Systems

- Process vs thread
- Context switching
- Scheduling
- Virtual memory
- Page cache
- File descriptors
- Memory leaks
- Resource exhaustion
- Deadlocks
- Locks

## Networking

- OSI/TCP-IP model
- IP
- Ports
- Sockets
- TCP handshake
- Retransmission
- Congestion
- DNS
- HTTP/1.1
- HTTP/2
- HTTPS
- TLS
- Certificates
- Keep-alive
- Connection pooling
- Timeouts
- Load balancers
- Reverse proxies

## Java Exit Criteria

- [ ] Explain HashMap internals
- [ ] Compare HashMap and ConcurrentHashMap
- [ ] Explain equals/hashCode
- [ ] Explain heap vs stack
- [ ] Explain GC at a practical level
- [ ] Explain volatile vs synchronized
- [ ] Implement producer-consumer
- [ ] Implement a thread-safe singleton
- [ ] Implement a bounded executor
- [ ] Explain CompletableFuture
- [ ] Explain virtual threads
- [ ] Debug a Java stack trace
- [ ] Explain common JVM performance problems

------------------------------------------------------------------------

# 🧩 PHASE 2 — DATA STRUCTURES & ALGORITHMS

**Duration:** Weeks 1–12 intensive, then maintenance through Week 52

**Objective:** Build SDE II interview-level problem-solving ability.

**Target:** 150–200 quality problems with revision.

The objective is pattern mastery, not maximizing problem count.

## Learning Order

### 1. Complexity

- Big-O
- Amortized analysis
- Worst case
- Average case
- Input constraints
- Invariants

### 2. Arrays & Strings

- Two pointers
- Sliding window
- Prefix sums
- Suffix sums
- Kadane-style reasoning
- Frequency arrays
- Sorting
- Custom comparators
- Matrix traversal
- Matrix rotation
- String parsing
- String normalization

### 3. Hashing

- HashMap
- HashSet
- Frequency counting
- Complement lookup
- Deduplication
- Grouping
- Anagrams
- Prefix sum + HashMap
- Custom keys

### 4. Stack / Queue / Deque

- Stack
- Queue
- Deque
- Monotonic stack
- Next greater/smaller
- Parentheses
- Expression parsing
- BFS
- Sliding-window deque

### 5. Linked Lists

- Reverse
- Fast/slow pointers
- Cycle detection
- Merge
- Intersection
- Partition
- LRU support structures

### 6. Binary Search

- Classic binary search
- First/last occurrence
- Rotated arrays
- Answer-space binary search
- Peak search
- Feasibility predicates

### 7. Trees

- DFS
- BFS
- Recursive/iterative traversal
- Height
- Diameter
- Path sums
- Lowest common ancestor
- Serialize/deserialize
- Views
- Level order

### 8. BST / Heap

- BST validation
- Insertion/deletion
- Kth element
- Heap construction
- PriorityQueue
- Top K
- Two heaps
- Scheduling

### 9. Recursion / Backtracking

- Subsets
- Permutations
- Combinations
- N-Queens
- Word search
- Pruning
- State restoration

### 10. Graphs

- Adjacency list/matrix
- DFS/BFS
- Cycle detection
- Connected components
- Topological sort
- Shortest path
- Dijkstra
- Union-Find
- Bipartite graphs

### 11. Greedy / Intervals

- Interval merge
- Scheduling
- Activity selection
- Heap-assisted scheduling
- Difference arrays
- Exchange argument

### 12. Dynamic Programming

- 1D DP
- 2D DP
- State definition
- Transition
- Base cases
- Knapsack
- LIS
- Grid DP
- String DP
- Memoization
- Tabulation
- Space optimization

### 13. Advanced Patterns

- Trie
- Bit manipulation
- Sweep line
- Union-Find applications
- Meet-in-the-middle
- Binary lifting concepts

## DSA Practice Method

``` text
Understand
    ↓
Clarify assumptions
    ↓
Brute force
    ↓
Identify pattern
    ↓
Optimize
    ↓
Code
    ↓
Test edge cases
    ↓
Complexity analysis
    ↓
Record mistake
    ↓
Solve again later
```

For every problem record:

- Pattern
- Key insight
- Complexity
- Why the first attempt failed
- One variation

## DSA Exit Criteria

- [ ] 150–200 quality problems
- [ ] Common medium problems solved within 25–35 minutes
- [ ] Common patterns recognized
- [ ] Brute force explained before optimization
- [ ] Clean Java code
- [ ] Edge cases tested
- [ ] Time/space complexity stated
- [ ] Timed mixed sets completed

------------------------------------------------------------------------

# 🗄️ PHASE 3 — SQL + DATABASES

**Duration:** Weeks 6–8

**Objective:** Become strong enough to reason about data models, query
performance and transaction behavior.

## SQL

- SELECT / FROM / WHERE
- GROUP BY / HAVING
- ORDER BY / LIMIT
- Aliases
- Expressions
- INNER / LEFT / RIGHT / FULL join concepts
- Self joins
- Anti joins
- Semi joins
- Subqueries
- Correlated subqueries
- EXISTS / NOT EXISTS
- CTEs
- Recursive CTE concepts
- Window functions
- ROW_NUMBER
- RANK
- DENSE_RANK
- LAG / LEAD
- CASE
- NULL
- COALESCE
- Date/time functions

## Data Modeling

- Primary keys
- Foreign keys
- Unique constraints
- Check constraints
- One-to-one
- One-to-many
- Many-to-many
- Normalization
- Denormalization
- Audit columns
- Soft delete
- Version columns
- Temporal data

## Indexes

- B-tree
- Composite indexes
- Leftmost-prefix behavior
- Selectivity
- Covering indexes
- Write cost
- Index scans
- Table scans

## Query Performance

Use `EXPLAIN` to reason about:

- Query plans
- Cardinality
- Join strategies
- Data volume
- Index usage
- Application behavior

## Transactions

- ACID
- Isolation levels
- Read uncommitted
- Read committed
- Repeatable read
- Serializable
- Dirty reads
- Non-repeatable reads
- Phantom reads
- Locks
- Deadlocks
- Optimistic locking
- Pessimistic locking
- MVCC

## JPA / Hibernate

- Persistence context
- Entity lifecycle
- Dirty checking
- Flush
- Lazy loading
- Eager loading
- N+1
- Fetch joins
- Entity graphs
- Batch fetching
- First-level cache
- Transactions
- Detached entities

## Exit Criteria

- [ ] Design a normalized schema
- [ ] Choose indexes for common queries
- [ ] Explain an EXPLAIN plan
- [ ] Explain transaction isolation
- [ ] Diagnose a deadlock
- [ ] Explain optimistic vs pessimistic locking
- [ ] Diagnose N+1
- [ ] Explain offset vs cursor pagination
- [ ] Design an order database

------------------------------------------------------------------------

# 🚀 PHASE 4 — SPRING BOOT + BACKEND ENGINEERING

**Duration:** Weeks 9–13

**Objective:** Turn framework familiarity into deep backend engineering
knowledge.

## Spring Core

- IoC
- Dependency Injection
- Bean scopes
- Configuration
- Component scanning
- Conditional beans
- Bean lifecycle
- Profiles
- Externalized configuration
- Configuration precedence
- Secrets
- Auto-configuration
- Starters
- ApplicationContext
- Actuator
- AOP concepts
- Proxies
- Pointcuts
- Advice

## Spring MVC / REST

- HTTP request lifecycle
- Filters
- Interceptors
- Controllers
- Argument resolvers
- Bean Validation
- Custom constraints
- Global exception handling
- Problem Details
- Serialization/deserialization
- Jackson
- Pagination
- Sorting
- Filtering
- API versioning
- ETags
- Concurrency concepts
- OpenAPI / Swagger

## Persistence

- Spring Data
- Repository patterns
- Custom queries
- Projections
- Transactions
- Isolation
- Propagation
- Rollback
- Connection pooling
- Pool sizing
- Timeouts
- Caching

## Testing

- JUnit 5
- Parameterized tests
- Mockito
- Integration tests
- Testcontainers concepts
- Contract testing
- Failure testing
- Retry testing
- Timeout testing
- Idempotency testing

## Production Backend Quality

- Configuration validation
- Safe defaults
- Feature flags
- Graceful shutdown
- Health checks
- Readiness
- Liveness
- Timeouts
- Bounded retries
- Exponential backoff
- Structured logging
- Correlation IDs
- Sensitive-data redaction
- Latency percentiles
- Throughput
- CPU
- Memory
- Database pool saturation

## Exit Criteria

Build a production-style REST API with:

- [ ] Authentication
- [ ] Authorization
- [ ] Validation
- [ ] Database
- [ ] Transactions
- [ ] Pagination
- [ ] Error handling
- [ ] Logging
- [ ] Tests
- [ ] OpenAPI documentation
- [ ] Health checks
- [ ] Timeouts
- [ ] Graceful shutdown

------------------------------------------------------------------------

# 🔐 PHASE 5 — SECURITY + API INTEGRATIONS

**Duration:** Weeks 14–16

## Authentication & Authorization

- Authentication vs authorization
- Identity federation
- OAuth 2.0
- Authorization Code + PKCE
- Client Credentials
- Refresh Tokens
- Scopes
- OpenID Connect
- ID Token vs Access Token
- JWT
- Signing vs encryption
- Token validation
- Key rotation
- Issuer
- Audience
- Expiration
- RBAC
- ABAC
- Least privilege
- Service-to-service authentication

## API Security

- TLS
- HTTPS
- CORS
- CSRF
- XSS
- SQL Injection
- SSRF
- IDOR
- Rate limiting
- Request-size limits
- Schema validation
- Secrets management
- Audit logging

## REST

- Resource modeling
- HTTP methods
- Idempotency
- Status codes
- Retries
- Versioning
- Backward compatibility

## SOAP

- SOAP envelope
- WSDL
- XML namespaces
- Fault handling
- Timeouts
- Integration testing

## Exit Criteria

- [ ] Explain OAuth2 end-to-end
- [ ] Explain OIDC
- [ ] Explain JWT validation
- [ ] Explain RBAC vs ABAC
- [ ] Secure a Spring Boot API
- [ ] Explain service-to-service authentication
- [ ] Identify common API security risks
- [ ] Design secure external integrations

------------------------------------------------------------------------

# 📨 PHASE 6 — MESSAGING + MICROSERVICES

**Duration:** Weeks 17–20

## Messaging Fundamentals

- Queue
- Topic
- Producer
- Consumer
- Acknowledgement
- Delivery semantics
- At-most-once
- At-least-once
- Exactly-once caveats
- Ordering
- Partitioning
- Duplicate delivery
- Idempotent consumers

## Reliability Patterns

- Retry
- Exponential backoff
- Jitter
- Dead-letter queues
- Retry queues
- Poison messages
- Backpressure
- Circuit breaker
- Bulkhead
- Concurrency limits
- Idempotency keys
- Deduplication
- Outbox
- Inbox
- Saga
- Compensating actions
- Replay

## Microservices

- Service boundaries
- Business capabilities
- Synchronous vs asynchronous communication
- API gateway
- Service discovery
- Load balancing
- Configuration
- Secrets
- Database-per-service
- Shared database risks
- Distributed transaction alternatives
- Eventual consistency
- Versioning

## Kafka Fundamentals

Learn after messaging fundamentals:

- Broker
- Topic
- Partition
- Offset
- Consumer group
- Partition key
- Ordering
- Consumer lag
- Replication
- Leader
- Retention
- Replay
- Compaction

## Exit Criteria

Design:

1.  Order workflow
2.  Notification system
3.  File-processing workflow

Each should include:

- Retry
- DLQ
- Idempotency
- Failure handling
- Monitoring
- Backpressure

------------------------------------------------------------------------

# 🌐 PHASE 7 — DISTRIBUTED SYSTEMS

**Duration:** Weeks 21–24

## Fundamentals

- Latency
- Throughput
- Concurrency
- Queueing
- Horizontal scaling
- Vertical scaling
- Stateless services
- Load balancing
- Availability
- Reliability
- Durability
- SLI
- SLO
- SLA

## CAP & Consistency

- CAP theorem
- Strong consistency
- Eventual consistency
- Read-your-writes
- Monotonic reads
- Consistency trade-offs

## Replication

- Leader/follower
- Replicas
- Quorum
- Failover
- Read replicas

## Partitioning

- Sharding
- Partition keys
- Hot partitions
- Rebalancing
- Consistent hashing concepts

## Distributed Time

- Clock skew
- Timestamp limitations
- Ordering
- Logical clocks concepts

## Caching

- Cache-aside
- Read-through
- Write-through
- Write-behind
- TTL
- Eviction
- Stale data
- Cache stampede
- Hot keys
- Request coalescing
- Local vs distributed cache

## Rate Limiting

- Fixed window
- Sliding window
- Token bucket
- Leaky bucket
- Distributed rate limiting

## Resilience

- Timeout
- Retry
- Circuit breaker
- Bulkhead
- Graceful degradation
- Load shedding
- Failure isolation

## Exit Criteria

Be able to reason about:

- Dependency failures
- Duplicate messages
- Duplicate processing
- Database scaling
- Hot partitions
- Consistency
- Partial failure
- Retry storms
- Cascading failures

------------------------------------------------------------------------

# 🧱 PHASE 8 — LOW-LEVEL DESIGN

**Duration:** Weeks 25–28

## Core Concepts

- SOLID
- Composition
- Encapsulation
- Abstraction
- Interfaces
- Dependency inversion
- Extensibility
- Testability
- Concurrency

## Design Patterns

- Factory
- Strategy
- Observer
- Builder
- Adapter
- Decorator
- State
- Repository

Focus on **when and why** to use patterns, not memorization.

## LLD Practice

- Parking Lot
- Vending Machine
- Elevator
- Library Management System
- Splitwise
- Notification System
- Rate Limiter
- Logging Framework
- LRU Cache
- File Storage Service

## LLD Interview Structure

``` text
Requirements
    ↓
Entities
    ↓
Responsibilities
    ↓
Interfaces
    ↓
Relationships
    ↓
Design Patterns
    ↓
Concurrency
    ↓
Extensibility
    ↓
Testing
    ↓
Trade-offs
```

------------------------------------------------------------------------

# 🏗️ PHASE 9 — HIGH-LEVEL DESIGN / SYSTEM DESIGN

**Duration:** Weeks 29–32

## System Design Fundamentals

- Requirements gathering
- Functional requirements
- Non-functional requirements
- Capacity estimation
- Traffic estimation
- Storage estimation
- API design
- Data modeling
- Service boundaries
- Database selection
- Caching
- Messaging
- Partitioning
- Replication
- Consistency
- Reliability
- Security
- Observability
- Cost
- Disaster recovery

## Systems to Practice

### Core

- URL Shortener
- File Upload
- File Sharing
- Notification System

### Intermediate

- Order Management
- Payment System
- Chat System
- Search / Autocomplete
- Video Streaming

### Advanced

- Instagram-style Feed
- WhatsApp-style Messaging
- Ride-Hailing
- AI Knowledge Assistant

## System Design Interview Framework

``` text
1. Clarify requirements
2. Define scale assumptions
3. Define APIs
4. Define data model
5. Draw high-level architecture
6. Explain request/data flow
7. Choose storage
8. Add caching if needed
9. Add messaging if needed
10. Identify bottlenecks
11. Discuss failures
12. Discuss scaling
13. Discuss consistency
14. Discuss security
15. Discuss observability
16. Discuss cost
17. Explain trade-offs
18. Discuss 10x scale
```

------------------------------------------------------------------------

# ☁️ PHASE 10 — AWS CLOUD

**Duration:** Weeks 33–36

## Fundamentals

- Regions
- Availability Zones
- Edge locations
- Fault domains
- Shared responsibility
- Scalability
- Elasticity
- Availability
- Durability
- RTO
- RPO
- Disaster recovery

## IAM

- Users
- Groups
- Roles
- Policies
- Identity-based policies
- Resource-based policies
- Least privilege
- Role assumption
- KMS
- Secrets Manager
- Parameter Store
- CloudTrail

## Networking

- VPC
- CIDR
- Subnets
- Route tables
- Internet Gateway
- NAT Gateway
- Security Groups
- Network ACL
- Public/private subnets
- DNS
- Route 53
- ALB
- NLB
- VPC endpoints

## Compute

- EC2
- Auto Scaling
- ECS
- EKS concepts
- Lambda

## Storage

- S3
- Versioning
- Lifecycle
- Encryption
- Signed URLs
- RDS
- Read replicas
- Multi-AZ
- DynamoDB concepts

## Messaging

- SQS
- SNS
- EventBridge
- Visibility timeout
- FIFO
- DLQ
- Long polling
- Fan-out
- Event routing

## Operations

- CloudWatch
- Logs
- Metrics
- Alarms
- Dashboards
- Cost optimization
- Right sizing
- Autoscaling
- Backup
- Multi-AZ

## Hands-on

Deploy a backend service:

``` text
Client
  ↓
ALB
  ↓
Backend Service
  ↓
RDS

Backend
  ↓
S3

Backend
  ↓
SQS
  ↓
Worker
```

Add IAM, monitoring, logging, alerts, scaling and security.

------------------------------------------------------------------------

# 🐳 PHASE 11 — DOCKER + KUBERNETES + TERRAFORM + CI/CD

**Duration:** Weeks 37–40

## Docker

- Images
- Containers
- Layers
- Registries
- Dockerfile
- Multi-stage builds
- Non-root containers
- Networking
- Volumes
- Compose
- Health checks
- Resource limits
- Secrets

## Kubernetes

- Cluster architecture
- Control plane
- Worker nodes
- Pods
- Deployments
- ReplicaSets
- Services
- Ingress
- ConfigMaps
- Secrets
- Requests
- Limits
- Probes
- HPA
- Storage
- RBAC
- NetworkPolicy
- Helm
- Rolling deployments
- Rollback

## Terraform

- Providers
- Resources
- Variables
- Locals
- Outputs
- Data sources
- State
- Remote state
- Locking
- Modules
- Plan
- Apply
- Destroy
- Drift
- Import
- Environment strategy
- Secrets

## CI/CD

``` text
Code
 ↓
Build
 ↓
Unit Tests
 ↓
Integration Tests
 ↓
Static Checks
 ↓
Package
 ↓
Artifact
 ↓
Deploy
 ↓
Smoke Test
 ↓
Monitor
```

Learn:

- GitHub Actions
- Jenkins
- Artifact repositories
- Versioning
- Blue/green
- Canary
- Rollback
- Security gates
- SBOM/provenance concepts

------------------------------------------------------------------------

# 🤖 PHASE 12 — AI / GENAI APPLICATION ENGINEERING

**Duration:** Weeks 41–44

## AI Fundamentals

- ML vocabulary
- Training vs inference
- Foundation models
- Transformers conceptually
- Tokenization
- Context windows
- Temperature
- Top-p
- Embeddings
- Semantic similarity

## LLM APIs

- Request/response
- Streaming
- Structured outputs
- Tool/function calling
- Prompt construction
- System instructions
- Context
- Few-shot examples
- JSON validation
- Retries
- Timeouts
- Rate limits
- Token accounting
- Cost

## RAG

``` text
Documents
   ↓
Parsing
   ↓
Cleaning
   ↓
Chunking
   ↓
Metadata
   ↓
Embeddings
   ↓
Vector Store
   ↓
Retrieval
   ↓
Reranking
   ↓
LLM
   ↓
Grounded Response
```

Learn:

- Chunk size
- Chunk overlap
- Metadata filtering
- Hybrid retrieval
- Vector search
- Reranking
- Query transformation
- Grounding
- Citations
- Retrieval quality
- Hallucination
- Stale indexes

## Vector Databases

- Vector indexes
- Distance metrics
- Nearest-neighbor search
- Metadata filters
- Multi-tenant isolation
- Upsert
- Delete
- Re-indexing
- Consistency

## Tool Calling

- Tool schema
- Validation
- Authorization
- Execution
- Tool results
- Bounded workflows
- State machines
- Human approval
- MCP concepts

**Important:** Authorization must remain server-side. The model must not
decide its own permissions.

## Spring AI

- ChatClient
- Model abstraction
- Streaming
- Embeddings
- Vector stores
- RAG
- Tool calling
- Advisors
- Memory
- Document ingestion
- Evaluation
- Observability

## AI Security

- Prompt injection
- Indirect prompt injection
- Data leakage
- PII redaction
- Secret protection
- Tool authorization
- Output validation
- Tenant isolation
- Audit logs
- Model/version tracking
- Token usage
- Cost controls

## AI Project

Build an **AI Enterprise Knowledge Assistant** with:

- Document ingestion
- PDF/text processing
- Chunking
- Embeddings
- Vector search
- RAG
- Citations
- One controlled tool
- Authorization
- Evaluation dataset
- Retrieval metrics
- Token tracking
- Latency tracking
- Prompt-injection protection

------------------------------------------------------------------------

# 📈 PHASE 13 — PRODUCTION ENGINEERING + OBSERVABILITY

**Duration:** Weeks 45–46

Production engineering is a supporting SDE capability. It should
strengthen software engineering rather than become a separate
SRE-focused career path.

## Observability

- Metrics
- Logs
- Traces
- Correlation IDs
- Trace IDs
- Structured logging

## Metrics

- Rate
- Errors
- Duration
- Utilization
- Saturation
- Queue depth
- Database pool health

## Percentiles

- p50
- p95
- p99

Understand why averages can hide tail latency.

## Prometheus

- Counters
- Gauges
- Histograms
- Labels
- Cardinality
- PromQL
- Rate
- Increase
- Aggregation
- Histogram quantiles

## Grafana

- Dashboards
- Panels
- Variables
- Annotations
- Alerts

## SRE Concepts for SDEs

- SLI
- SLO
- SLA
- Error budgets
- Incident severity
- Incident response
- Root cause analysis
- Runbooks
- Postmortems
- Capacity planning
- Load testing
- Cascading failures
- Retry storms

------------------------------------------------------------------------

# 🧪 PROJECT ROADMAP

## Project 1 — Production-Grade Order Management Backend

### Technologies

- Java
- Spring Boot
- REST
- SQL
- JPA/Hibernate
- Security
- Testing

### Modules

- Customer
- Catalog
- Order
- Inventory
- Payment-state simulation
- Notification

### Features

- Authentication
- Authorization
- Order creation
- Idempotency
- Inventory reservation
- Optimistic locking
- Pagination
- Validation
- Audit history
- Error handling
- Unit tests
- Integration tests
- OpenAPI
- Structured logging
- Correlation IDs

------------------------------------------------------------------------

## Project 2 — Event-Driven Notification Platform

### Concepts

- Messaging
- Async processing
- Retry
- DLQ
- Idempotency
- Templates
- Provider adapters
- Delivery states
- Rate limiting
- Failure isolation

### Architecture

``` text
Application
    ↓
Notification API
    ↓
Message Queue
    ↓
Notification Workers
    ↓
Provider Adapters
    ↓
External Providers
```

Add metrics for:

- Queue depth
- Processing time
- Failures
- Retries
- Delivery status

------------------------------------------------------------------------

## Project 3 — Cloud-Native Backend Platform

Take Project 1 and deploy it using:

- Docker
- AWS
- Terraform
- Kubernetes or ECS
- RDS
- S3
- SQS
- CI/CD
- Observability

Document:

- Architecture
- Networking
- Security
- Deployment
- Scaling
- Failure scenarios
- Cost

------------------------------------------------------------------------

## Project 4 — AI Enterprise Knowledge Assistant

Combine:

- Spring Boot
- Spring AI
- LLM
- Embeddings
- Vector store
- RAG
- Tool calling
- Evaluation
- Security
- Observability

------------------------------------------------------------------------

# 🏆 CAPSTONE PROJECT

## AI-Enabled Cloud-Native Operations Platform

Combine the previous projects only after understanding each component
independently.

``` text
Event-Driven Backend
        ↓
AWS
        ↓
Container Platform
        ↓
Terraform
        ↓
Observability
        ↓
AI Assistant
```

The AI assistant can:

- Retrieve runbooks
- Summarize incidents
- Explain deployment history
- Retrieve operational information
- Draft non-destructive diagnostic actions

The model must never:

- Receive unrestricted production credentials
- Bypass authorization
- Directly perform unrestricted production actions

Document:

- Architecture
- Capacity assumptions
- Failure modes
- Cost model
- Security threat model
- Architecture decisions

------------------------------------------------------------------------

# 💻 SDE II INTERVIEW PREPARATION

Interview preparation runs throughout the roadmap.

## DSA

- Timed problems
- Pattern recognition
- Clean coding
- Complexity analysis
- Edge cases
- Follow-up variations

## Java

- HashMap
- ConcurrentHashMap
- equals/hashCode
- String immutability
- volatile
- synchronized
- Lock
- ExecutorService
- Thread pools
- CompletableFuture
- Virtual threads
- JVM memory
- GC
- Concurrency
- Generics
- Records
- Interfaces
- Abstract classes

## Backend

- Dependency Injection
- Bean lifecycle
- Spring Boot auto-configuration
- Transactions
- Isolation
- N+1
- Connection pooling
- Caching
- Validation
- Exception handling
- API versioning
- Graceful shutdown
- Testing
- Timeouts
- Retries
- Circuit breaker

## Database

- Indexes
- Composite indexes
- EXPLAIN
- Transactions
- Isolation
- Deadlocks
- Optimistic locking
- Pessimistic locking
- Pagination
- Normalization
- Denormalization
- Read replicas
- Schema migration

## Distributed Systems

- CAP
- Consistency
- Replication
- Partitioning
- Idempotency
- Outbox
- Saga
- Retry storms
- Circuit breaker
- Bulkhead
- Message ordering
- Eventual consistency
- Hot partitions
- Cache stampede
- Rate limiting

## LLD

- Parking Lot
- Rate Limiter
- Notification System
- Elevator
- Vending Machine
- Splitwise
- LRU Cache
- Logging Framework

## HLD

- URL Shortener
- Notification Platform
- Order System
- Payment System
- Chat System
- Search
- File Storage
- Video Streaming
- Social Feed
- Ride-Hailing
- AI Knowledge Assistant

------------------------------------------------------------------------

# 🗣️ BEHAVIORAL PREPARATION

Build a library of **12–15 real stories**.

Story categories:

- Production issue
- Customer problem
- Difficult technical decision
- Failure / mistake
- Conflict / disagreement
- Automation / improvement
- Tight deadline
- Learning a new technology
- Ownership
- Debugging
- Delivery
- Ambiguous requirements

## STAR+ Method

### Situation

2–3 sentences of necessary context.

### Task

What outcome were you personally responsible for?

### Action

Spend most of the answer here.

Explain decisions, alternatives, technical work and trade-offs.

### Result

Use real outcomes. Never fabricate metrics.

### Reflection

What did you learn? What changed in your engineering approach?

------------------------------------------------------------------------

# 🧪 MOCK INTERVIEW PLAN

| Week | Focus                      | Target                           |
|------|----------------------------|----------------------------------|
| 47   | DSA + Java                 | 2 mocks                          |
| 48   | LLD + HLD                  | 2 mocks                          |
| 49   | Behavioral + System Design | 2 mocks                          |
| 50   | Coding + Design + Testing  | 2 mocks                          |
| 51   | Full technical loops       | 3–4 mocks                        |
| 52   | Final simulation           | Targeted revision + applications |

------------------------------------------------------------------------

# 📊 READINESS GATES

Do not mark a topic complete merely because a course has been finished.

## Gate A — DSA

- [ ] 150–200 quality problems
- [ ] Medium problems solved within 25–35 minutes
- [ ] Patterns recognized
- [ ] Complexity explained
- [ ] Edge cases tested

## Gate B — Java

- [ ] Collections explained
- [ ] JVM memory explained
- [ ] GC explained
- [ ] Concurrency explained
- [ ] Modern Java understood
- [ ] Production debugging can be discussed

## Gate C — Backend

- [ ] Production-style REST API built
- [ ] Database integrated
- [ ] Security implemented
- [ ] Transactions understood
- [ ] Tests written
- [ ] Failure handling implemented

## Gate D — LLD

- [ ] 6–8 designs implemented
- [ ] SOLID applied
- [ ] Patterns explained
- [ ] Concurrency considered
- [ ] Extensibility discussed

## Gate E — HLD

- [ ] 10+ designs practiced
- [ ] Requirements clarified
- [ ] Capacity estimated
- [ ] Architecture explained
- [ ] Bottlenecks identified
- [ ] Failure handling discussed
- [ ] Trade-offs explained

## Gate F — Cloud

- [ ] Backend deployed to AWS
- [ ] Networking understood
- [ ] IAM understood
- [ ] Scaling explained
- [ ] Security explained
- [ ] Cost discussed

## Gate G — AI

- [ ] RAG application built
- [ ] Vector search understood
- [ ] Tool calling implemented
- [ ] Evaluation created
- [ ] Guardrails implemented
- [ ] AI security understood
- [ ] Cost and latency measured

## Gate H — Behavioral

- [ ] 12–15 STAR stories prepared
- [ ] Personal ownership is clear
- [ ] Failure story prepared
- [ ] Conflict story prepared
- [ ] Customer-impact story prepared
- [ ] Technical-decision stories prepared

------------------------------------------------------------------------

# 📅 WEEKLY STUDY SYSTEM

Recommended baseline: **18–20 focused hours per week**

| Day       | Focus                                              |
|-----------|----------------------------------------------------|
| Monday    | 60m DSA + 30m Java + 30m System Design             |
| Tuesday   | 60m DSA + 30m Backend + 30m Notes                  |
| Wednesday | 60m DSA + 30m CS/Cloud + 30m Revision              |
| Thursday  | 60m DSA + 30m LLD/HLD + 30m Coding                 |
| Friday    | 60m DSA + 30m Interview Explanation + 30m Revision |
| Saturday  | 2h DSA timed + 2h Project + 1h System Design       |
| Sunday    | 2h DSA review + 1.5h Project/Cloud + 1h Behavioral |

------------------------------------------------------------------------

# 📝 DAILY TRACKING

Record:

``` text
Date
Topic
Resource
What was learned
Implementation completed
Problems solved
Mistakes
Interview questions
Confidence (1–5)
Next revision date
```

------------------------------------------------------------------------

# 🔁 WEEKLY REVIEW

## Technical

- What did I learn?
- What did I implement?
- What did I struggle with?
- What can I explain without notes?

## DSA

- Which patterns did I learn?
- Which problems did I fail?
- Why did I fail?
- Can I solve similar problems?

## Engineering

- What did I build?
- What bugs did I encounter?
- What trade-offs did I discover?

## Interview

- What questions could an interviewer ask?
- Can I explain the topic verbally?

------------------------------------------------------------------------

# 🚫 WHAT NOT TO DO

- Do not learn technologies only because they appear in job
  descriptions.
- Do not collect certifications instead of building engineering depth.
- Do not learn multiple programming languages for coding interviews.
- Use Java as the primary interview language.
- Do not jump into Kubernetes before understanding Linux, networking,
  containers and basic cloud concepts.
- Do not memorize system-design diagrams.
- Do not memorize design patterns without understanding their purpose.
- Do not blindly copy AI-generated solutions.
- Do not treat the number of solved problems as the only DSA metric.
- Do not add technologies to professional experience that were not
  actually used.
- Do not make SRE/DevOps the primary identity when targeting SDE II.
- Do not learn AI as a replacement for backend engineering.
- Do not skip revision.

------------------------------------------------------------------------

# 🏁 END STATE

> **An experienced software engineer who can solve coding problems,
> design backend systems, reason about distributed systems, build secure
> production-grade services, deploy them to the cloud, debug production
> issues, and build AI-enabled applications.**

``` text
                    SDE II
                      │
        ┌─────────────┼─────────────┐
        │             │             │
      Coding       Backend       System Design
        │             │             │
       DSA       Java/Spring    Distributed Systems
        │             │             │
        └─────────────┼─────────────┘
                      │
                    Cloud
                      │
             AWS / Containers
                      │
              Production Skills
                      │
                 AI / GenAI
```

------------------------------------------------------------------------

# 🔑 Final Rule

> **Depth beats breadth.**
>
> Every technology learned should become something you can:
>
> **Build → Debug → Explain → Design → Defend**
>
> The goal is not to become someone who knows many technologies.
>
> The goal is to become an engineer who can solve difficult software
> engineering problems at SDE II level.