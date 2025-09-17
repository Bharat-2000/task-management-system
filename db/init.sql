-- Create schema
CREATE SCHEMA IF NOT EXISTS "task-management-system";

-- Create enum type for user roles
DO $$ BEGIN
    CREATE TYPE "user_role" AS ENUM ('SUPERADMIN', 'ADMIN', 'USER');
EXCEPTION
    WHEN duplicate_object THEN null;
END $$;

-- Create user table
CREATE TABLE IF NOT EXISTS "task-management-system"."user" (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    role_id "user_role" NOT NULL,
    created_at BIGINT,
    created_by UUID,
    updated_at BIGINT,
    updated_by UUID
);

-- Optional: Add unique constraint on email if required
-- ALTER TABLE "task-management-system"."user" ADD CONSTRAINT unique_email UNIQUE (email);

