// Generated by jextract

package tech.bitey.golpanama.xlib;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct {
 *     int type;
 *     Display *display;
 *     XID resourceid;
 *     unsigned long serial;
 *     unsigned char error_code;
 *     unsigned char request_code;
 *     unsigned char minor_code;
 * }
 * }
 */
public class XErrorEvent {

    XErrorEvent() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        Xlib_h.C_INT.withName("type"),
        MemoryLayout.paddingLayout(4),
        Xlib_h.C_POINTER.withName("display"),
        Xlib_h.C_LONG.withName("resourceid"),
        Xlib_h.C_LONG.withName("serial"),
        Xlib_h.C_CHAR.withName("error_code"),
        Xlib_h.C_CHAR.withName("request_code"),
        Xlib_h.C_CHAR.withName("minor_code"),
        MemoryLayout.paddingLayout(5)
    ).withName("$anon$924:9");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final OfInt type$LAYOUT = (OfInt)$LAYOUT.select(groupElement("type"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static final OfInt type$layout() {
        return type$LAYOUT;
    }

    private static final long type$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static final long type$offset() {
        return type$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static int type(MemorySegment struct) {
        return struct.get(type$LAYOUT, type$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int type
     * }
     */
    public static void type(MemorySegment struct, int fieldValue) {
        struct.set(type$LAYOUT, type$OFFSET, fieldValue);
    }

    private static final AddressLayout display$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("display"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * Display *display
     * }
     */
    public static final AddressLayout display$layout() {
        return display$LAYOUT;
    }

    private static final long display$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * Display *display
     * }
     */
    public static final long display$offset() {
        return display$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * Display *display
     * }
     */
    public static MemorySegment display(MemorySegment struct) {
        return struct.get(display$LAYOUT, display$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * Display *display
     * }
     */
    public static void display(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(display$LAYOUT, display$OFFSET, fieldValue);
    }

    private static final OfLong resourceid$LAYOUT = (OfLong)$LAYOUT.select(groupElement("resourceid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * XID resourceid
     * }
     */
    public static final OfLong resourceid$layout() {
        return resourceid$LAYOUT;
    }

    private static final long resourceid$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * XID resourceid
     * }
     */
    public static final long resourceid$offset() {
        return resourceid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * XID resourceid
     * }
     */
    public static long resourceid(MemorySegment struct) {
        return struct.get(resourceid$LAYOUT, resourceid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * XID resourceid
     * }
     */
    public static void resourceid(MemorySegment struct, long fieldValue) {
        struct.set(resourceid$LAYOUT, resourceid$OFFSET, fieldValue);
    }

    private static final OfLong serial$LAYOUT = (OfLong)$LAYOUT.select(groupElement("serial"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long serial
     * }
     */
    public static final OfLong serial$layout() {
        return serial$LAYOUT;
    }

    private static final long serial$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long serial
     * }
     */
    public static final long serial$offset() {
        return serial$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long serial
     * }
     */
    public static long serial(MemorySegment struct) {
        return struct.get(serial$LAYOUT, serial$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long serial
     * }
     */
    public static void serial(MemorySegment struct, long fieldValue) {
        struct.set(serial$LAYOUT, serial$OFFSET, fieldValue);
    }

    private static final OfByte error_code$LAYOUT = (OfByte)$LAYOUT.select(groupElement("error_code"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char error_code
     * }
     */
    public static final OfByte error_code$layout() {
        return error_code$LAYOUT;
    }

    private static final long error_code$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char error_code
     * }
     */
    public static final long error_code$offset() {
        return error_code$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char error_code
     * }
     */
    public static byte error_code(MemorySegment struct) {
        return struct.get(error_code$LAYOUT, error_code$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char error_code
     * }
     */
    public static void error_code(MemorySegment struct, byte fieldValue) {
        struct.set(error_code$LAYOUT, error_code$OFFSET, fieldValue);
    }

    private static final OfByte request_code$LAYOUT = (OfByte)$LAYOUT.select(groupElement("request_code"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char request_code
     * }
     */
    public static final OfByte request_code$layout() {
        return request_code$LAYOUT;
    }

    private static final long request_code$OFFSET = 33;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char request_code
     * }
     */
    public static final long request_code$offset() {
        return request_code$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char request_code
     * }
     */
    public static byte request_code(MemorySegment struct) {
        return struct.get(request_code$LAYOUT, request_code$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char request_code
     * }
     */
    public static void request_code(MemorySegment struct, byte fieldValue) {
        struct.set(request_code$LAYOUT, request_code$OFFSET, fieldValue);
    }

    private static final OfByte minor_code$LAYOUT = (OfByte)$LAYOUT.select(groupElement("minor_code"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned char minor_code
     * }
     */
    public static final OfByte minor_code$layout() {
        return minor_code$LAYOUT;
    }

    private static final long minor_code$OFFSET = 34;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned char minor_code
     * }
     */
    public static final long minor_code$offset() {
        return minor_code$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned char minor_code
     * }
     */
    public static byte minor_code(MemorySegment struct) {
        return struct.get(minor_code$LAYOUT, minor_code$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned char minor_code
     * }
     */
    public static void minor_code(MemorySegment struct, byte fieldValue) {
        struct.set(minor_code$LAYOUT, minor_code$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

