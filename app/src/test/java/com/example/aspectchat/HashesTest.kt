package com.example.aspectchat

import com.example.aspectchat.core.util.crypto.BLAKE3_256
import com.example.aspectchat.core.util.crypto.GOST_256
import com.example.aspectchat.core.util.crypto.Keccak_256
import com.example.aspectchat.core.util.crypto.RIPEMD_256
import com.example.aspectchat.core.util.crypto.SHA3_256
import com.example.aspectchat.core.util.crypto.SHAKE_256
import com.example.aspectchat.core.util.crypto.SKEIN_256
import com.example.aspectchat.core.util.crypto.TIGER_128
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Assert.assertEquals
import org.junit.Test


@HiltAndroidTest
@OptIn(ExperimentalStdlibApi::class)
class HashesTest {
    @Test
    fun hash_sha3_256() {
        val hash = SHA3_256.hash("Hello Kotlin".toByteArray(Charsets.UTF_8))
        val hash2 = SHA3_256.hash("Hello Kotlin".toByteArray(Charsets.UTF_8))
        val hex1 = hash.toHexString()
        val hex2 = hash2.toHexString()

        println("Sha256 hash: $hex1")
        println("Sha256 hash2: $hex2")
        println("hash1 size: ${hash.size}")
        println("hash2 size: ${hash2.size}")

        assertEquals(hex1, hex2)
    }

    @Test
    fun hash_keccak_256() {
        val hash = Keccak_256.hash("Hello Kotlin".toByteArray(Charsets.UTF_8))
        val hash2 = Keccak_256.hash("Hello Kotlin".toByteArray(Charsets.UTF_8))
        val hex1 = hash.toHexString()
        val hex2 = hash2.toHexString()

        println("Keccak256 hash: $hex1")
        println("Keccak256 hash2: $hex2")
        println("hash1 size: ${hash.size}")
        println("hash2 size: ${hash2.size}")

        assertEquals(hex1, hex2)
    }

    @Test
    fun hash_blake3_256() {
        val hash = BLAKE3_256.hash("Hello Kotlin".toByteArray(Charsets.UTF_8))
        val hash2 = BLAKE3_256.hash("Hello Kotlin".toByteArray(Charsets.UTF_8))
        val hex1 = hash.toHexString()
        val hex2 = hash2.toHexString()

        println("Blake3_256 hash: $hex1")
        println("Blake3_256 hash2: $hex2")
        println("hash1 size: ${hash.size}")
        println("hash2 size: ${hash2.size}")

        assertEquals(hex1, hex2)
    }


    @Test
    fun hash_shake_256() {
        val hash = SHAKE_256.hash("Hello Kotlin".toByteArray(Charsets.UTF_8))
        val hash2 = SHAKE_256.hash("Hello Kotlin".toByteArray(Charsets.UTF_8))
        val hex1 = hash.toHexString()
        val hex2 = hash2.toHexString()

        println("Shake256 hash: $hex1")
        println("Shake256 hash2: $hex2")
        println("hash1 size: ${hash.size}")
        println("hash2 size: ${hash2.size}")

        assertEquals(hex1, hex2)
    }

    @Test
    fun hash_skein_256() {
        val hash = SKEIN_256.hash("Hello Kotlin".toByteArray(Charsets.UTF_8))
        val hash2 = SKEIN_256.hash("Hello Kotlin".toByteArray(Charsets.UTF_8))
        val hex1 = hash.toHexString()
        val hex2 = hash2.toHexString()

        println("Skein256 hash: $hex1")
        println("Skein256 hash2: $hex2")
        println("hash1 size: ${hash.size}")
        println("hash2 size: ${hash2.size}")

        assertEquals(hex1, hex2)
    }
    @Test
    fun hash_tiger_128() {
        val hash = TIGER_128.hash("Hello Kotlin".toByteArray(Charsets.UTF_8))
        val hash2 = TIGER_128.hash("Hello Kotlin".toByteArray(Charsets.UTF_8))
        val hex1 = hash.toHexString()
        val hex2 = hash2.toHexString()

        println("Tiger128 hash: $hex1" )
        println("Tiger128 hash2: $hex2")
        println("hash1 size ${hash.size}")
        println("hash2 size ${hash2.size}")

        assertEquals(hex1,hex2)
    }
    @Test
    fun hash_ripemd_256() {
        val hash = RIPEMD_256.hash("Hello Kotlin".toByteArray(Charsets.UTF_8))
        val hash2 = RIPEMD_256.hash("Hello Kotlin".toByteArray(Charsets.UTF_8))
        val hex1 = hash.toHexString()
        val hex2 = hash2.toHexString()

        println("RIPEMD256 hash: $hex1" )
        println("RIPEMD256 hash2: $hex2")
        println("hash1 size ${hash.size}")
        println("hash2 size ${hash2.size}")

        assertEquals(hex1,hex2)
    }
    @Test
    fun hash_GOST_256() {
        val hash = GOST_256.hash("Hello Kotlin".toByteArray(Charsets.UTF_8))
        val hash2 = GOST_256.hash("Hello Kotlin".toByteArray(Charsets.UTF_8))
        val hex1 = hash.toHexString()
        val hex2 = hash2.toHexString()

        println("GOST_256 hash: $hex1" )
        println("GOST_256 hash2: $hex2")
        println("hash1 size ${hash.size}")
        println("hash2 size ${hash2.size}")

        assertEquals(hex1,hex2)
    }
}