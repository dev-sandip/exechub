# Exec Hub An Online Code Execution Platform In Java

## 📌 Project Setup

- [X] Create Spring Boot project (modular monolith)
- [X] Configure Maven dependencies
- [X] Set up PostgreSQL/MySQL database
- [ ] Configure Redis
- [ ] Set up Docker for code execution
- [X] Configure Swagger/OpenAPI
- [X] Set up project package/module structure
- [ ] Configure environment profiles

---

## 👤 Authentication & User Module

- [ ] Implement user registration
- [ ] Implement login with JWT
- [ ] Hash passwords securely
- [ ] Implement role-based access control (User, Admin, Problem Setter)
- [ ] Create user profile update feature
- [ ] Implement admin user activation/deactivation

---

## 📚 Problem Management Module

- [ ] Create problem entity and schema
- [ ] Implement CRUD operations for problems
- [ ] Add tags and difficulty levels
- [ ] Set time and memory limits
- [ ] Implement problem status (draft, published, archived)
- [ ] Enable problem browsing and filtering

---

## 🧪 Test Case Module

- [ ] Add sample test cases
- [ ] Add hidden test cases
- [ ] Store expected outputs securely
- [ ] Prevent access to hidden test cases
- [ ] Support large test cases

---

## ▶️ Code Run Module (Custom Input)

- [ ] Allow language selection
- [ ] Run code with custom input
- [ ] Execute code inside Docker container
- [ ] Capture stdout and stderr
- [ ] Enforce execution timeout
- [ ] Restrict network access during execution

---

## 📤 Submission Module

- [ ] Create submission entity
- [ ] Implement submit code API
- [ ] Store source code and metadata
- [ ] Set initial status `IN_QUEUE`
- [ ] Track submission timestamps
- [ ] Implement submission history view
- [ ] Enable admin submission search

---

## ⚙️ Execution & Judge Module

- [ ] Process submissions asynchronously
- [ ] Compile code for compiled languages
- [ ] Execute against all test cases
- [ ] Compare output with expected output
- [ ] Implement verdict logic:
    - [ ] ACCEPTED
    - [ ] WRONG_ANSWER
    - [ ] COMPILATION_ERROR
    - [ ] RUNTIME_ERROR
    - [ ] TIME_LIMIT_EXCEEDED
    - [ ] MEMORY_LIMIT_EXCEEDED
- [ ] Track execution time and memory usage
- [ ] Stop execution on limit exceed
- [ ] Store results
- [ ] Implement rejudge (single & bulk)

---

## 🏆 Contest Module

- [ ] Create contest entity
- [ ] Assign problems to contests
- [ ] Set start and end times
- [ ] Allow users to join contests
- [ ] Restrict submissions to contest time
- [ ] Calculate scores
- [ ] Generate leaderboard

---

## 🛠️ Admin Module

- [ ] Manage users
- [ ] Publish/unpublish problems
- [ ] Monitor execution jobs
- [ ] View reports
- [ ] Detect suspicious activity
- [ ] Configure languages and limits

---

## 📜 Audit & Logging

- [ ] Log authentication events
- [ ] Log submission lifecycle
- [ ] Log execution failures
- [ ] Log admin actions
- [ ] Store audit data

---

## 🔐 Security

- [ ] Enforce authentication on APIs
- [ ] Secure password storage
- [ ] Enforce RBAC
- [ ] Run code in isolated Docker containers
- [ ] Restrict file system access
- [ ] Disable network in execution containers
- [ ] Enforce time & memory limits
- [ ] Implement rate limiting

---

## ⚡ Performance & Scalability

- [ ] Ensure API response < 2s (non-execution)
- [ ] Handle concurrent submissions
- [ ] Implement submission queue
- [ ] Add Redis caching
- [ ] Optimize database queries
- [ ] Support scaling execution workers

---

## 🧱 Core Development Phases

- [ ] Requirement analysis
- [ ] System design (architecture, ERD, APIs)
- [ ] Core backend development
- [ ] Advanced features (contest, leaderboard)
- [ ] Testing and stabilization
- [ ] Deployment and documentation

---

## 🧪 Testing

- [ ] Unit testing (services, utilities)
- [ ] Integration testing (API, DB, Redis)
- [ ] Docker execution testing
- [ ] Security testing
- [ ] Performance testing
- [ ] Acceptance testing

---

## 🚀 Deployment

- [ ] Prepare Docker Compose setup
- [ ] Configure environment variables
- [ ] Deploy backend application
- [ ] Set up HTTPS (production)
- [ ] Configure logging and monitoring
- [ ] Set up database backup

---

## ⚠️ Risk Handling

- [ ] Secure sandbox execution
- [ ] Prevent resource exhaustion
- [ ] Validate inputs strictly
- [ ] Protect hidden test cases
- [ ] Test edge cases thoroughly

---

## 🔮 Future Enhancements

- [ ] Plagiarism detection
- [ ] AI-based hints
- [ ] Live collaboration
- [ ] Discussion forums
- [ ] Code similarity analysis
- [ ] WebSocket real-time updates
